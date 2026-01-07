import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.cancel_service_order_create_event import CancelServiceOrderCreateEvent  # noqa: E501
from openapi_server.models.cancel_service_order_information_required_event import CancelServiceOrderInformationRequiredEvent  # noqa: E501
from openapi_server.models.cancel_service_order_state_change_event import CancelServiceOrderStateChangeEvent  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.service_order_attribute_value_change_event import ServiceOrderAttributeValueChangeEvent  # noqa: E501
from openapi_server.models.service_order_create_event import ServiceOrderCreateEvent  # noqa: E501
from openapi_server.models.service_order_delete_event import ServiceOrderDeleteEvent  # noqa: E501
from openapi_server.models.service_order_information_required_event import ServiceOrderInformationRequiredEvent  # noqa: E501
from openapi_server.models.service_order_jeopardy_event import ServiceOrderJeopardyEvent  # noqa: E501
from openapi_server.models.service_order_milestone_event import ServiceOrderMilestoneEvent  # noqa: E501
from openapi_server.models.service_order_state_change_event import ServiceOrderStateChangeEvent  # noqa: E501
from openapi_server import util


def cancel_service_order_create_event(body):  # noqa: E501
    """Client listener for entity CancelServiceOrderCreateEvent

    Example of a client listener for receiving the notification CancelServiceOrderCreateEvent # noqa: E501

    :param cancel_service_order_create_event: CancelServiceOrder create Event payload
    :type cancel_service_order_create_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    cancel_service_order_create_event = body
    if connexion.request.is_json:
        cancel_service_order_create_event = CancelServiceOrderCreateEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def cancel_service_order_information_required_event(body):  # noqa: E501
    """Client listener for entity CancelServiceOrderInformationRequiredEvent

    Example of a client listener for receiving the notification CancelServiceOrderInformationRequiredEvent # noqa: E501

    :param cancel_service_order_information_required_event: CancelServiceOrder informationRequired Event payload
    :type cancel_service_order_information_required_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    cancel_service_order_information_required_event = body
    if connexion.request.is_json:
        cancel_service_order_information_required_event = CancelServiceOrderInformationRequiredEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def cancel_service_order_state_change_event(body):  # noqa: E501
    """Client listener for entity CancelServiceOrderStateChangeEvent

    Example of a client listener for receiving the notification CancelServiceOrderStateChangeEvent # noqa: E501

    :param cancel_service_order_state_change_event: CancelServiceOrder stateChange Event payload
    :type cancel_service_order_state_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    cancel_service_order_state_change_event = body
    if connexion.request.is_json:
        cancel_service_order_state_change_event = CancelServiceOrderStateChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_attribute_value_change_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderAttributeValueChangeEvent

    Example of a client listener for receiving the notification ServiceOrderAttributeValueChangeEvent # noqa: E501

    :param service_order_attribute_value_change_event: ServiceOrder attributeValueChange Event payload
    :type service_order_attribute_value_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_attribute_value_change_event = body
    if connexion.request.is_json:
        service_order_attribute_value_change_event = ServiceOrderAttributeValueChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_create_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderCreateEvent

    Example of a client listener for receiving the notification ServiceOrderCreateEvent # noqa: E501

    :param service_order_create_event: ServiceOrder create Event payload
    :type service_order_create_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_create_event = body
    if connexion.request.is_json:
        service_order_create_event = ServiceOrderCreateEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_delete_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderDeleteEvent

    Example of a client listener for receiving the notification ServiceOrderDeleteEvent # noqa: E501

    :param service_order_delete_event: ServiceOrder delete Event payload
    :type service_order_delete_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_delete_event = body
    if connexion.request.is_json:
        service_order_delete_event = ServiceOrderDeleteEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_information_required_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderInformationRequiredEvent

    Example of a client listener for receiving the notification ServiceOrderInformationRequiredEvent # noqa: E501

    :param service_order_information_required_event: ServiceOrder informationRequired Event payload
    :type service_order_information_required_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_information_required_event = body
    if connexion.request.is_json:
        service_order_information_required_event = ServiceOrderInformationRequiredEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_jeopardy_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderJeopardyEvent

    Example of a client listener for receiving the notification ServiceOrderJeopardyEvent # noqa: E501

    :param service_order_jeopardy_event: ServiceOrder jeopardy Event payload
    :type service_order_jeopardy_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_jeopardy_event = body
    if connexion.request.is_json:
        service_order_jeopardy_event = ServiceOrderJeopardyEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_milestone_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderMilestoneEvent

    Example of a client listener for receiving the notification ServiceOrderMilestoneEvent # noqa: E501

    :param service_order_milestone_event: ServiceOrder milestone Event payload
    :type service_order_milestone_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_milestone_event = body
    if connexion.request.is_json:
        service_order_milestone_event = ServiceOrderMilestoneEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def service_order_state_change_event(body):  # noqa: E501
    """Client listener for entity ServiceOrderStateChangeEvent

    Example of a client listener for receiving the notification ServiceOrderStateChangeEvent # noqa: E501

    :param service_order_state_change_event: ServiceOrder stateChange Event payload
    :type service_order_state_change_event: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    service_order_state_change_event = body
    if connexion.request.is_json:
        service_order_state_change_event = ServiceOrderStateChangeEvent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
