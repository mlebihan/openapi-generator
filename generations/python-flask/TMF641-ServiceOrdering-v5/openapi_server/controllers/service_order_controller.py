import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.json_patch import JsonPatch  # noqa: E501
from openapi_server.models.patch_service_order200_response import PatchServiceOrder200Response  # noqa: E501
from openapi_server.models.service_order import ServiceOrder  # noqa: E501
from openapi_server.models.service_order_fvo import ServiceOrderFVO  # noqa: E501
from openapi_server.models.service_order_mvo import ServiceOrderMVO  # noqa: E501
from openapi_server import util


def create_service_order(body, fields=None):  # noqa: E501
    """Creates a ServiceOrder

    This operation creates a ServiceOrder entity. # noqa: E501

    :param service_order_fvo: The ServiceOrder to be created
    :type service_order_fvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ServiceOrder, Tuple[ServiceOrder, int], Tuple[ServiceOrder, int, Dict[str, str]]
    """
    service_order_fvo = body
    if connexion.request.is_json:
        service_order_fvo = ServiceOrderFVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_service_order(id):  # noqa: E501
    """Deletes a ServiceOrder

    This operation deletes a ServiceOrder entity. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_service_order(fields=None, offset=None, limit=None):  # noqa: E501
    """List or find ServiceOrder objects

    List or find ServiceOrder objects # noqa: E501

    :param fields: Comma-separated properties to be provided in response
    :type fields: str
    :param offset: Requested index for start of resources to be provided in response
    :type offset: int
    :param limit: Requested number of resources to be provided in response
    :type limit: int

    :rtype: Union[List[ServiceOrder], Tuple[List[ServiceOrder], int], Tuple[List[ServiceOrder], int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_service_order(id, body, fields=None):  # noqa: E501
    """Updates partially a ServiceOrder

    This operation updates partially a ServiceOrder entity. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param service_order_mvo: The ServiceOrder to be patched
    :type service_order_mvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ServiceOrder, Tuple[ServiceOrder, int], Tuple[ServiceOrder, int, Dict[str, str]]
    """
    service_order_mvo = body
    if connexion.request.is_json:
        service_order_mvo = ServiceOrderMVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def retrieve_service_order(id, fields=None):  # noqa: E501
    """Retrieves a ServiceOrder by ID

    This operation retrieves a ServiceOrder entity. Attribute selection enabled for all first level attributes. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[ServiceOrder, Tuple[ServiceOrder, int], Tuple[ServiceOrder, int, Dict[str, str]]
    """
    return 'do some magic!'
