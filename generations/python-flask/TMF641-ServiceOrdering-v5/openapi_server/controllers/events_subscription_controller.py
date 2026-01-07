import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.hub import Hub  # noqa: E501
from openapi_server.models.hub_fvo import HubFVO  # noqa: E501
from openapi_server import util


def create_hub(body):  # noqa: E501
    """Create a subscription (hub) to receive Events

    Sets the communication endpoint to receive Events. # noqa: E501

    :param hub_fvo: Data containing the callback endpoint to deliver the information
    :type hub_fvo: dict | bytes

    :rtype: Union[Hub, Tuple[Hub, int], Tuple[Hub, int, Dict[str, str]]
    """
    hub_fvo = body
    if connexion.request.is_json:
        hub_fvo = HubFVO.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def hub_delete(id):  # noqa: E501
    """Remove a subscription (hub) to receive Events

     # noqa: E501

    :param id: Identifier of the Resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
