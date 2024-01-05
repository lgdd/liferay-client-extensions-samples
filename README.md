![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/lgdd/liferay-client-extensions-samples/builder.yml?label=auto-update&style=flat)
![GitHub last commit](https://img.shields.io/github/last-commit/lgdd/liferay-client-extensions-samples?color=informational&label=latest%20update)

# Liferay Client Extensions Samples

Automatically mirror official client extensions samples you can find in the main repo here: https://github.com/liferay/liferay-portal/tree/master/workspaces/liferay-sample-workspace/client-extensions

The goal of this repository is to ease the process of trying out client extensions samples by removing the burden of cloning liferay-portal & by renaming ambiguous client extensions (e.g. `custom-element-1`).

The official readme file for those samples is mirrored in the [HOW-TO.md](HOW-TO.md).

The new naming is an arbitrary choice based on the description provided by Liferay in the readme file. Here's the correspondance for the renamed client extensions:

| **Original name** | **New name**                                                 |
|-------------------|--------------------------------------------------------------|
| liferay-sample-custom-element-1  | liferay-sample-custom-element-vanilla-js      |
| liferay-sample-custom-element-2  | liferay-sample-custom-element-react-scripts   |
| liferay-sample-custom-element-3  | liferay-sample-custom-element-angular         |
| liferay-sample-custom-element-4  | liferay-sample-custom-element-react-dom       |
| liferay-sample-custom-element-5  | liferay-sample-custom-element-react-clayui    |
| liferay-sample-etc-frontend-1    | liferay-sample-etc-frontend-components        |
| liferay-sample-etc-frontend-2    | liferay-sample-etc-frontend-shared-utils      |
| liferay-sample-etc-frontend-3    | liferay-sample-etc-frontend-shared-import-map |
| liferay-sample-iframe-1          | liferay-sample-iframe-counter                 |
| liferay-sample-iframe-2          | liferay-sample-iframe-wikipedia               |
| liferay-sample-theme-css-1       | liferay-sample-theme-css-styled               |
| liferay-sample-theme-css-2       | liferay-sample-theme-css-unstyled             |
| liferay-sample-theme-spritemap-1 | liferay-sample-theme-spritemap-single-svg     |
| liferay-sample-theme-spritemap-2 | liferay-sample-theme-spritemap-multiple-svg   |

## Aditional information

If the build fails because of the Node version, you can force the use of a specific version by changing the build.gradle with something like:

```gradle
apply plugin: "com.liferay.node"

node {
	nodeVersion = "20.10.0"
	global = false
}
```
> Note that you can apply this for a specific client extension or all client extensions if you change the value in the parent folder (`client-extensions` or your liferay workpace).