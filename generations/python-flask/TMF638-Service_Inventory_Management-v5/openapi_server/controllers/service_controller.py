import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.json_patch import JsonPatch  # noqa: E501
from openapi_server.models.service_fvo import ServiceFVO  # noqa: E501
from openapi_server.models.service_mvo import ServiceMVO  # noqa: E501
from openapi_server.models.service_res import ServiceRES  # noqa: E501
from openapi_server import util


def create_service(body, fields=None):  # noqa: E501
    """Creates a Service

    This operation creates a Service entity. # noqa: E501

    :param service_fvo: The Service to be created
    :type service_fvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ServiceRES, Tuple[ServiceRES, int], Tuple[ServiceRES, int, Dict[str, str]]
    """
    service_fvo = body
    if connexion.request.is_json:
        service_fvo = ServiceFVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_service(id):  # noqa: E501
    """Deletes a Service

    This operation deletes a Service entity. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_service(fields=None, offset=None, limit=None, before=None, after=None, sort=None, filter=None):  # noqa: E501
    """List or find Service objects

    List or find Service objects # noqa: E501

    :param fields: Comma-separated properties to be provided in response
    :type fields: str
    :param offset: Requested index for start of resources to be provided in response
    :type offset: int
    :param limit: Requested number of resources to be provided in response
    :type limit: int
    :param before: An opaque string value representing the page results before the cursor value
    :type before: str
    :param after: An opaque string value representing the page results after the cursor value
    :type after: str
    :param sort: The default direction is Ascending order, the use of the modifier in front of the sort field name, “-“, changes the sort order direction.
    :type sort: str
    :param filter: Filter a collection using JSONPath
    :type filter: str

    :rtype: Union[List[ServiceRES], Tuple[List[ServiceRES], int], Tuple[List[ServiceRES], int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_service(id, body, fields=None):  # noqa: E501
    """Updates partially a Service

    This operation updates partially a Service entity. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param service_mvo: The Service to be patched
    :type service_mvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ServiceRES, Tuple[ServiceRES, int], Tuple[ServiceRES, int, Dict[str, str]]
    """
    service_mvo = body
    if connexion.request.is_json:
        service_mvo = ServiceMVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def retrieve_service(id, fields=None):  # noqa: E501
    """Retrieves a Service by ID

    This operation retrieves a Service entity. Attribute selection enabled for all first level attributes. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ServiceRES, Tuple[ServiceRES, int], Tuple[ServiceRES, int, Dict[str, str]]
    """
    return 'do some magic!'
