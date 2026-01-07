import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.json_patch import JsonPatch  # noqa: E501
from openapi_server.models.patch_service_order200_response import PatchServiceOrder200Response  # noqa: E501
from openapi_server.models.service_order import ServiceOrder  # noqa: E501
from openapi_server.models.service_order_fvo import ServiceOrderFVO  # noqa: E501
from openapi_server.models.service_order_mvo import ServiceOrderMVO  # noqa: E501
from openapi_server.test import BaseTestCase


class TestServiceOrderController(BaseTestCase):
    """ServiceOrderController integration test stubs"""

    def test_create_service_order(self):
        """Test case for create_service_order

        Creates a ServiceOrder
        """
        service_order_fvo = openapi_server.ServiceOrderFVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/serviceOrder',
            method='POST',
            headers=headers,
            data=json.dumps(service_order_fvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_service_order(self):
        """Test case for delete_service_order

        Deletes a ServiceOrder
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/serviceOrder/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_service_order(self):
        """Test case for list_service_order

        List or find ServiceOrder objects
        """
        query_string = [('fields', 'fields_example'),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/serviceOrder',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_patch_service_order(self):
        """Test case for patch_service_order

        Updates partially a ServiceOrder
        """
        service_order_mvo = openapi_server.ServiceOrderMVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/serviceOrder/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(service_order_mvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_service_order(self):
        """Test case for retrieve_service_order

        Retrieves a ServiceOrder by ID
        """
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceOrdering/v5/serviceOrder/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
