import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.json_patch import JsonPatch  # noqa: E501
from openapi_server.models.service_fvo import ServiceFVO  # noqa: E501
from openapi_server.models.service_mvo import ServiceMVO  # noqa: E501
from openapi_server.models.service_res import ServiceRES  # noqa: E501
from openapi_server.test import BaseTestCase


class TestServiceController(BaseTestCase):
    """ServiceController integration test stubs"""

    def test_create_service(self):
        """Test case for create_service

        Creates a Service
        """
        service_fvo = openapi_server.ServiceFVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceInventory/v5/service',
            method='POST',
            headers=headers,
            data=json.dumps(service_fvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_service(self):
        """Test case for delete_service

        Deletes a Service
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceInventory/v5/service/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_service(self):
        """Test case for list_service

        List or find Service objects
        """
        query_string = [('fields', 'fields_example'),
                        ('offset', 56),
                        ('limit', 56),
                        ('before', 'before_example'),
                        ('after', 'after_example'),
                        ('sort', 'sort_example'),
                        ('filter', 'attachment[?(@size==300)]')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceInventory/v5/service',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_patch_service(self):
        """Test case for patch_service

        Updates partially a Service
        """
        service_mvo = openapi_server.ServiceMVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceInventory/v5/service/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(service_mvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_service(self):
        """Test case for retrieve_service

        Retrieves a Service by ID
        """
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/tmf-api/serviceInventory/v5/service/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
