import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.json_patch import JsonPatch  # noqa: E501
from openapi_server.models.resource_fvo import ResourceFVO  # noqa: E501
from openapi_server.models.resource_mvo import ResourceMVO  # noqa: E501
from openapi_server.models.resource_res import ResourceRES  # noqa: E501
from openapi_server.test import BaseTestCase


class TestResourceController(BaseTestCase):
    """ResourceController integration test stubs"""

    def test_create_resource(self):
        """Test case for create_resource

        Creates a Resource
        """
        resource_fvo = openapi_server.ResourceFVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/resource',
            method='POST',
            headers=headers,
            data=json.dumps(resource_fvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_resource(self):
        """Test case for delete_resource

        Deletes a Resource
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/resource/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_resource(self):
        """Test case for list_resource

        List or find Resource objects
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
            '/resourceInventory/v5/resource',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_patch_resource(self):
        """Test case for patch_resource

        Updates partially a Resource
        """
        resource_mvo = openapi_server.ResourceMVO()
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/resource/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(resource_mvo),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_resource(self):
        """Test case for retrieve_resource

        Retrieves a Resource by ID
        """
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/resourceInventory/v5/resource/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
