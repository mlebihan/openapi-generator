import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.resource_attribute_value_change_event import ResourceAttributeValueChangeEvent  # noqa: E501
from openapi_server.models.resource_create_event import ResourceCreateEvent  # noqa: E501
from openapi_server.models.resource_delete_event import ResourceDeleteEvent  # noqa: E501
from openapi_server.models.resource_state_change_event import ResourceStateChangeEvent  # noqa: E501
from openapi_server import util


def resource_attribute_value_change_event(body):  # noqa: E501
    """Client listener for entity ResourceAttributeValueChangeEvent

    Example of a client listener for receiving the notification ResourceAttributeValueChangeEvent # noqa: E501

    :param resource_attribute_value_change_event: Resource attributeValueChange Event payload
    :type resource_attribute_value_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    resource_attribute_value_change_event = body
    if connexion.request.is_json:
        resource_attribute_value_change_event = ResourceAttributeValueChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def resource_create_event(body):  # noqa: E501
    """Client listener for entity ResourceCreateEvent

    Example of a client listener for receiving the notification ResourceCreateEvent # noqa: E501

    :param resource_create_event: Resource create Event payload
    :type resource_create_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    resource_create_event = body
    if connexion.request.is_json:
        resource_create_event = ResourceCreateEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def resource_delete_event(body):  # noqa: E501
    """Client listener for entity ResourceDeleteEvent

    Example of a client listener for receiving the notification ResourceDeleteEvent # noqa: E501

    :param resource_delete_event: Resource delete Event payload
    :type resource_delete_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    resource_delete_event = body
    if connexion.request.is_json:
        resource_delete_event = ResourceDeleteEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def resource_state_change_event(body):  # noqa: E501
    """Client listener for entity ResourceStateChangeEvent

    Example of a client listener for receiving the notification ResourceStateChangeEvent # noqa: E501

    :param resource_state_change_event: Resource stateChange Event payload
    :type resource_state_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    resource_state_change_event = body
    if connexion.request.is_json:
        resource_state_change_event = ResourceStateChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
