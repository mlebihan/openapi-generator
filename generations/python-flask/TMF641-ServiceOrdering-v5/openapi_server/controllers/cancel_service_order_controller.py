import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.cancel_service_order import CancelServiceOrder  # noqa: E501
from openapi_server.models.cancel_service_order_fvo import CancelServiceOrderFVO  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def create_cancel_service_order(body, fields=None):  # noqa: E501
    """Creates a CancelServiceOrder

    This operation creates a CancelServiceOrder entity. # noqa: E501

    :param cancel_service_order_fvo: The CancelServiceOrder to be created
    :type cancel_service_order_fvo: dict | bytes
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[CancelServiceOrder, Tuple[CancelServiceOrder, int], Tuple[CancelServiceOrder, int, Dict[str, str]]
    """
    cancel_service_order_fvo = body
    if connexion.request.is_json:
        cancel_service_order_fvo = CancelServiceOrderFVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def list_cancel_service_order(fields=None, offset=None, limit=None):  # noqa: E501
    """List or find CancelServiceOrder objects

    List or find CancelServiceOrder objects # noqa: E501

    :param fields: Comma-separated properties to be provided in response
    :type fields: str
    :param offset: Requested index for start of resources to be provided in response
    :type offset: int
    :param limit: Requested number of resources to be provided in response
    :type limit: int

    :rtype: Union[List[CancelServiceOrder], Tuple[List[CancelServiceOrder], int], Tuple[List[CancelServiceOrder], int, Dict[str, str]]
    """
    return 'do some magic!'


def retrieve_cancel_service_order(id, fields=None):  # noqa: E501
    """Retrieves a CancelServiceOrder by ID

    This operation retrieves a CancelServiceOrder entity. Attribute selection enabled for all first level attributes. # noqa: E501

    :param id: Identifier of the Resource
    :type id: str
    :param fields: Comma-separated properties to be provided in response
    :type fields: str

    :rtype: Union[CancelServiceOrder, Tuple[CancelServiceOrder, int], Tuple[CancelServiceOrder, int, Dict[str, str]]
    """
    return 'do some magic!'
