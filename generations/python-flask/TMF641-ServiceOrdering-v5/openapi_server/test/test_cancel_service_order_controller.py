import unittest

from flask import json

from openapi_server.models.cancel_service_order import CancelServiceOrder  # noqa: E501
from openapi_server.models.cancel_service_order_fvo import CancelServiceOrderFVO  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCancelServiceOrderController(BaseTestCase):
    """CancelServiceOrderController integration test stubs"""

    def test_create_cancel_service_order(self):
        """Test case for create_cancel_service_order

        Creates a CancelServiceOrder
        """
        cancel_service_order_fvo = openapi_server.CancelServiceOrderFVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/cancelServiceOrder',
            method='POST',
            headers=headers,
            data=json.dumps(cancel_service_order_fvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_cancel_service_order(self):
        """Test case for list_cancel_service_order

        List or find CancelServiceOrder objects
        """
        query_string = [('fields', 'fields_example'),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/cancelServiceOrder',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_cancel_service_order(self):
        """Test case for retrieve_cancel_service_order

        Retrieves a CancelServiceOrder by ID
        """
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/cancelServiceOrder/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
