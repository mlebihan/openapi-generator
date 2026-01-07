import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.hub import Hub  # noqa: E501
from openapi_server.models.hub_fvo import HubFVO  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEventsSubscriptionController(BaseTestCase):
    """EventsSubscriptionController integration test stubs"""

    def test_create_hub(self):
        """Test case for create_hub

        Create a subscription (hub) to receive Events
        """
        hub_fvo = {"@type":"Hub","callback":"https://host/tmf-api/specificAPIName/v5/listener/specificEventListener","query":"data"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/hub',
            method='POST',
            headers=headers,
            data=json.dumps(hub_fvo),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_hub_delete(self):
        """Test case for hub_delete

        Remove a subscription (hub) to receive Events
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/hub/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_hub_get(self):
        """Test case for hub_get

        Retrieve a subscription (hub)
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/hub/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
