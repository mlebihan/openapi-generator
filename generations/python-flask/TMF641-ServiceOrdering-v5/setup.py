import sys
from setuptools import setup, find_packages

NAME = "openapi_server"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "connexion>=2.0.2",
    "swagger-ui-bundle>=0.0.2",
    "python_dateutil>=2.6.0"
]

setup(
    name=NAME,
    version=VERSION,
    description="ServiceOrdering",
    author_email="",
    url="",
    keywords=["OpenAPI", "ServiceOrdering"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['openapi/openapi.yaml']},
    include_package_data=True,
    entry_points={
        'console_scripts': ['openapi_server=openapi_server.__main__:main']},
    long_description="""\
    ## TMF API Reference : TMF 641 - Service Ordering Management   Version 5.0   The Service Order API provides a standardized mechanism for managing Service Order, a type of order which can be used to place an order between internal Customer Order management system to service order management system or between a service provider and a partner and vice versa.  ### Service Order resource A service order will describe a list of service order items.  A service order item references an action on an existing or future  service.  By  service  we  designed  Customer Facing  Service  (CFS)  as  well  as  Resource Facing Service (RFS). From a component perspective, a service order should be available - from a Service Orchestration Component (and it could mix CFS and RFS) - from an Infrastructure Control &amp; Management component (and it would have only RFS)  ### TMF641 performs the following operations on service order resource : - Retrieval of a service order or a collection of service orders depending on filter criteria - Partial update of a service order (including updating rules) - Creation of a service order (including default values and creation rules) - Deletion of service order (for administration purposes) - Notification of events on Service order  **Cancel Service Order resource**  This resource is used to request a service order cancellation.  **TMF641 provides following operations on Cancel Service Order resource :**  - Retrieval of a cancel service order or a collection of cancel service orders  - Creation of a cancel service order  - Notification of events on cancel service order.  Copyright © TM Forum 2020. All Rights Reserved
    """
)

