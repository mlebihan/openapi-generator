
Vérification de la génération TMF en serveur REST dans différents langages
--------------------------------------------------------------------------

## Invocation d'Open API generator 7.23.0-SNAPSHOT

Il s'agit de sa version en cours de développement.

`java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate -i "${yaml}" -g "$generator" -o "${target}"`

avec :

  - `$yaml` = le fichier TMF désiré. Par exemple, TMF638 se trouve dans `modules/openapi-generator/src/test/resources/3_0/spring/TMF638-Service_Inventory_Management-v5.1.0.oas.yaml`, pour ce test
  - `$generator` = <un des générateurs de la liste ci-dessous>
  - `$target` = <un répertoire de génération pour tester le code produit>

## Choix du TM Forum de test

Ces specs TM Forum m'étaient disponibles :

- TMF632-Party_Management-v5.0.0.oas.yaml
- TMF634-Resource_Catalog_Management-v5.0.0.oas.yaml
- TMF638-Service_Inventory_Management-v5.1.0.oas.yaml
- TMF639-Resource_Inventory_Management-v5.0.0.oas.yaml
- TMF641-ServiceOrdering-v5.0.0.oas.yaml
- TMF669-Party_Role_Management-v5.0.0.oas.yaml
- TMF720-Digital_Identity_Management_API-v5.0.0.oas.yaml

Téléchargeables, avec d'autres, depuis le [github de TM Forum](https://github.com/orgs/tmforum-apis/repositories). 

J'ai observé que leur génération en `rust-axum` compilait, sauf pour `TMF638`. Je me donc penché sur celui-ci avec d'autres langages de génération.  

`TMF638-Service_Inventory_Management-v5.1.0.oas.yaml` est une longue spécification, de 5 800 lignes.  
`TMF641-ServiceOrdering-v5.0.0.oas.yaml`, de 7 900.

## Compilation et lancement du serveur REST

1. Compilation d'après les procédures habituelles du langage, sauf si quelque-chose de spécial est précisé dans le README.md de ce qui a été généré.
2. Lancement du serveur REST en suivant les étapes du README.md.
3. On s'attend à voir la doc swagger décrivant les méthodes publiées, ou bien le yaml rendu au format yaml ou json.

## Résultat des tests

`OK : localhost` signifie que les docs swagger des web-services ont pu être obtenues sur http://localhost:8080.  
Tout autre message est une erreur de compilation ou d'exécution.

|   TMF   | rust-server                                      | rust-axum                                      | spring                                | python-flask    | python-fastapi | typescript-nestjs-server   | nodejs-express-server | go-server                       | go-gin-server                             | cpp-oatpp-server             | cpp-pistache-server                      |
|:-------:|--------------------------------------------------|------------------------------------------------|---------------------------------------|-----------------|----------------|----------------------------|-----------------------|---------------------------------|-------------------------------------------|------------------------------|------------------------------------------|
| TMF 638 | models::Position not found                       | models::Position not found                     | OK : swagger                          | circular import | OK : swagger   | à implémenter manuellement | OK : spec yaml        | undefined time                  | undefined time et go version 1.23 requise | erreurs à l'édition de liens | Code généré trop vieux pour être compilé |
| TMF 641 | Bug corrigible interger/f32, puis OK : localhost | OK, mais un main manque pour lancer le serveur | AtTypeEnum not compatible with String | circular import | OK : swagger   | non testé                  | OK : spec yaml        | undefined time, enums en double | non testé                                 | non testé                    | non testé                                |

## Annexe : Construction des environnements

### Rust Server

```bash
cargo build && cargo test
cargo run --example openapi_client-server
```

### Rust Axum

```bash
cargo build && cargo test
```

### Python Flask

```bash
python3 -m venv .venv
source .venv/bin/activate
pip3 install -r requirements.txt
python3 -m openapi_server
```

### Python Fast-API

```bash
python3 -m venv .venv
source .venv/bin/activate
pip3 install -r requirements.txt
PYTHONPATH=src uvicorn openapi_server.main:app --host 0.0.0.0 --port 8080
```

Aller sur [le contexte web `docs`](http://localhost:8080/docs)

### Java Spring (ou Spring-Boot)

```bash
mvn clean install
java -jar target/openapi-spring-5.1.0.jar
```

Aller sur [le contexte web `swagger-ui`](http://localhost:8080/swagger-ui)

### Node JS Express

```bash
npm install
node --run start -- --port 8080
```

Aller sur [le contexte web `openapi`](http://localhost:8080/openapi)

### Go Server

```bash
go mod tidy
go build
go run main.go # alternative
```

### Go Gin Server

```bash
go mod tidy
docker build .
```

### C++ OAT++ Server

Modification de la version minimale de CMake dans les `CMakeLists.txt` des projets présents ou téléchargés, pour qu'ils soient acceptés par mon compilateur.

```bash
mkdir build
cd build/
cmake ..
make -j16
```

### C++ Pistache Server

Modification de la version minimale de CMake dans les `CMakeLists.txt` des projets présents ou téléchargés, pour qu'ils soient acceptés par mon compilateur.

```bash
mkdir build
cd build/
cmake ..
make -j16
```
