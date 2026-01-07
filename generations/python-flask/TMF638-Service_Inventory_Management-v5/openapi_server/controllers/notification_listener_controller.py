import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.service_attribute_value_change_event import ServiceAttributeValueChangeEvent  # noqa: E501
from openapi_server.models.service_create_event import ServiceCreateEvent  # noqa: E501
from openapi_server.models.service_delete_event import ServiceDeleteEvent  # noqa: E501
from openapi_server.models.service_operating_status_change_event import ServiceOperatingStatusChangeEvent  # noqa: E501
from openapi_server.models.service_state_change_event import ServiceStateChangeEvent  # noqa: E501
from openapi_server import util


def service_attribute_value_change_event(body):  # noqa: E501
    """Client listener for entity ServiceAttributeValueChangeEvent

    Example of a client listener for receiving the notification ServiceAttributeValueChangeEvent # noqa: E501

    :param service_attribute_value_change_event: Service attributeValueChange Event payload
    :type service_attribute_value_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_attribute_value_change_event = body
    if connexion.request.is_json:
        service_attribute_value_change_event = ServiceAttributeValueChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_create_event(body):  # noqa: E501
    """Client listener for entity ServiceCreateEvent

    Example of a client listener for receiving the notification ServiceCreateEvent # noqa: E501

    :param service_create_event: Service create Event payload
    :type service_create_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_create_event = body
    if connexion.request.is_json:
        service_create_event = ServiceCreateEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_delete_event(body):  # noqa: E501
    """Client listener for entity ServiceDeleteEvent

    Example of a client listener for receiving the notification ServiceDeleteEvent # noqa: E501

    :param service_delete_event: Service delete Event payload
    :type service_delete_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_delete_event = body
    if connexion.request.is_json:
        service_delete_event = ServiceDeleteEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_operating_status_change_event(body):  # noqa: E501
    """Client listener for entity ServiceOperatingStatusChangeEvent

    Example of a client listener for receiving the notification ServiceOperatingStatusChangeEvent # noqa: E501

    :param service_operating_status_change_event: Service operatingStatusChange Event payload
    :type service_operating_status_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_operating_status_change_event = body
    if connexion.request.is_json:
        service_operating_status_change_event = ServiceOperatingStatusChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_state_change_event(body):  # noqa: E501
    """Client listener for entity ServiceStateChangeEvent

    Example of a client listener for receiving the notification ServiceStateChangeEvent # noqa: E501

    :param service_state_change_event: Service stateChange Event payload
    :type service_state_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_state_change_event = body
    if connexion.request.is_json:
        service_state_change_event = ServiceStateChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
