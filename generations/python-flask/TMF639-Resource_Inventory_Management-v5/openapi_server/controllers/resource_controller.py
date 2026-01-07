import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.json_patch import JsonPatch  # noqa: E501
from openapi_server.models.resource_fvo import ResourceFVO  # noqa: E501
from openapi_server.models.resource_mvo import ResourceMVO  # noqa: E501
from openapi_server.models.resource_res import ResourceRES  # noqa: E501
from openapi_server import util


def create_resource(body, fields=None):  # noqa: E501
    """Creates a Resource

    This operation creates a Resource entity. # noqa: E501

    :param resource_fvo: The Resource to be created
    :type resource_fvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ResourceRES, Tuple[ResourceRES, int], Tuple[ResourceRES, int, Dict[str, str]]
    """
    resource_fvo = body
    if connexion.request.is_json:
        resource_fvo = ResourceFVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_resource(id):  # noqa: E501
    """Deletes a Resource

    This operation deletes a Resource entity. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_resource(fields=None, offset=None, limit=None, before=None, after=None, sort=None, filter=None):  # noqa: E501
    """List or find Resource objects

    List or find Resource objects # noqa: E501

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

    :rtype: Union[List[ResourceRES], Tuple[List[ResourceRES], int], Tuple[List[ResourceRES], int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_resource(id, body, fields=None):  # noqa: E501
    """Updates partially a Resource

    This operation updates partially a Resource entity. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param resource_mvo: The Resource to be patched
    :type resource_mvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ResourceRES, Tuple[ResourceRES, int], Tuple[ResourceRES, int, Dict[str, str]]
    """
    resource_mvo = body
    if connexion.request.is_json:
        resource_mvo = ResourceMVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def retrieve_resource(id, fields=None):  # noqa: E501
    """Retrieves a Resource by ID

    This operation retrieves a Resource entity. Attribute selection enabled for all first level attributes. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ResourceRES, Tuple[ResourceRES, int], Tuple[ResourceRES, int, Dict[str, str]]
    """
    return 'do some magic!'
