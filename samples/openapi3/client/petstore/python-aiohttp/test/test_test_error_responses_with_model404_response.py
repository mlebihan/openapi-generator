# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from petstore_api.models.test_error_responses_with_model404_response import TestErrorResponsesWithModel404Response

class TestTestErrorResponsesWithModel404Response(unittest.TestCase):
    """TestErrorResponsesWithModel404Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TestErrorResponsesWithModel404Response:
        """Test TestErrorResponsesWithModel404Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TestErrorResponsesWithModel404Response`
        """
        model = TestErrorResponsesWithModel404Response()
        if include_optional:
            return TestErrorResponsesWithModel404Response(
                reason404 = ''
            )
        else:
            return TestErrorResponsesWithModel404Response(
        )
        """

    def testTestErrorResponsesWithModel404Response(self):
        """Test TestErrorResponsesWithModel404Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
