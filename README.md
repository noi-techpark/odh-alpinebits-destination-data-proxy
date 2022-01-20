# AlpineBits DestinationData Proxy

This is a reference implementation for an AlpineBits DestinationData server. The server exposes data from the OpenDataHub API in accordance to the AlpineBits format.

However, the main purpose of this application is to operate as proxy to forward requests to the dedicated versions of the reference implementation.

Additionally, this project also hosts the OpenAPI specification of the reference implementation. For detailed instructions regarding the OpenAPI specification, click [here](./openapi).

[![ci odh-alpinebits-destination-data-proxy](https://github.com/noi-techpark/odh-alpinebits-destination-data-proxy/actions/workflows/ci.yml/badge.svg)](https://github.com/noi-techpark/odh-alpinebits-destination-data-proxy/actions/workflows/ci.yml)

## Table of contents

- [Gettings started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Source code](#source-code)
  - [Execute](#execute)
- [Information](#information)

## Getting started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

To build the project, the following prerequisites must be met:

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

### Source code

Get a copy of the repository:

```bash
git clone https://github.com/noi-techpark/ odh-alpinebits-destination-data-proxy.git
```

Change directory:

```bash
cd  odh-alpinebits-destination-data-proxy/
```

### Execute

Copy the file `.env.example` to `.env` and adjust the configuration parameters.

Then you can start the application using the following command:

```bash
docker-compose up
```

The service will be available at http://localhost:8080.

## Information

### Guidelines

Find [here](https://opendatahub.readthedocs.io/en/latest/guidelines.html) guidelines for developers.

### Support

For support, please contact [info@opendatahub.bz.it](mailto:info@opendatahub.bz.it).

### Contributing

If you'd like to contribute, please follow the following instructions:

- Fork the repository.

- Checkout a topic branch from the `development` branch.

- Make sure the tests are passing.

- Create a pull request against the `development` branch.

A more detailed description can be found here: [https://github.com/noi-techpark/documentation/blob/master/contributors.md](https://github.com/noi-techpark/documentation/blob/master/contributors.md).

### Documentation

More documentation can be found at [https://opendatahub.readthedocs.io/en/latest/index.html](https://opendatahub.readthedocs.io/en/latest/index.html).

### License

The code in this project is licensed under the GNU AFFERO GENERAL PUBLIC LICENSE Version 3 license. See the [LICENSE.md](LICENSE.md) file for more information.
