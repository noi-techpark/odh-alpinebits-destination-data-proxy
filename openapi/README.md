# AlpineBits DestinationData OpenAPI Specification

This project contains an OpenAPI specification based on the [AlpineBits DestinationData](https://www.alpinebits.org/destinationdata/) standard.
This project's goal is two-fold: first, to provide an entry point for server and client developers to the AlpineBits DestinationData standard; second, to provide a template for server developers to document their own implementations of the AlpineBits DestinationData standard.

This project is not intended as a replacement of the official documentation of the AlpineBits DestinationData standard, but as a additional resource. This specification, for instance, does not cover the aspects like responsibilities of servers and clients involved in requests.

To access this specification as a live Swagger documentation, visit [https://alpinebits.gitlab.io/destinationdata/tools](https://alpinebits.gitlab.io/destinationdata/tools).

## Modifying the Specification

In order to modify the specification, both in case of improving the specification contained here, and in case of using this project as template for the documentation of your own server, go to the file `src/index.yml`. This file is the "entry point" for the whole specification, which is split in multiple files to enable modularization and reuse. Navigate through `$ref` references to understand how the specification is composed.

For developing the specification, the usage of [Visual Studio Code](https://code.visualstudio.com/) along with the extension [OpenAPI (Swagger) Editor](https://marketplace.visualstudio.com/items?itemName=42Crunch.vscode-openapi) is highly recommended. This extension supports real-time visualization of a Swagger documentation based on the specification. This extension is also able to handle specification split into multiple files.

## Compiling the Specification

Some tools and deployment environments cannot handle OpenAPI specifications that are split into multiple files. Therefore, in order to compile the specification into a single file, run the following command from the project's root (requires NPM and Node):

```bash
npm install            # run only once to retrieve dependencies
npm run bundle
```

This command compiles the file `src/index.yml` and its dependencies into the files `src/specification.json` and `src/specification.yml`.

If you wish to validate your specification to check whether it violates constraints of the OpenAPI specification, you can run the following command:

```bash
npm run validate
```

## Hosting a Swagger Page with Docker

If you wish to use Docker to offer this specification as a Swagger interactive documentation, you can run the following command:

```bash
npm run host
```

By default, page will be hosted on port `3000`, but this can be easily modified in the `package.json` file.

## Deploying Swagger as a Static Page

Additionally, you can use the contents of the folder `/public` to deploy the project as a static page. In fact, when `npm run bundle` is executed, the all necessary files for this static page are already generated.
