![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/lgdd/liferay-client-extensions-samples/builder.yml?label=auto-update&style=flat)
![GitHub last commit](https://img.shields.io/github/last-commit/lgdd/liferay-client-extensions-samples?color=informational&label=latest%20update)

# Liferay Client Extensions Samples

Automatically mirror official client extensions samples you can find in the main repo here: https://github.com/liferay/liferay-portal/tree/master/workspaces/liferay-sample-workspace/client-extensions

The goal of this repository is to ease the process of trying out client extensions samples by removing the burden of cloning liferay-portal & by renaming ambiguous client extensions (e.g. `custom-element-1`).

The official readme file for those samples is mirrored in the [HOW-TO.md](HOW-TO.md).

The new naming is an arbitrary choice based on the description provided by Liferay in the readme file. Here's the correspondance for the renamed client extensions:

| **Original name** | **New name**                   |
|-------------------|--------------------------------|
| custom-element-1  | custom-element-vanilla-js      |
| custom-element-2  | custom-element-react-scripts   |
| custom-element-3  | custom-element-angular         |
| custom-element-4  | custom-element-react-dom       |
| custom-element-5  | custom-element-react-clayui    |
| etc-frontend-1    | etc-frontend-components        |
| etc-frontend-2    | etc-frontend-shared-utils      |
| etc-frontend-3    | etc-frontend-shared-import-map |
| iframe-1          | iframe-counter                 |
| iframe-2          | iframe-wikipedia               |
| theme-css-1       | theme-css-styled               |
| theme-css-2       | theme-css-unstyled             |
| theme-spritemap-1 | theme-spritemap-single-svg     |
| theme-spritemap-2 | theme-spritemap-multiple-svg   |

## License

[MIT](LICENSE)
