﻿/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the ProductListResultNextLink class.
 * @constructor
 * The list storage accounts operation response.
 * @member {array} [value] Gets the list of products and their
 * properties.
 * 
 */
function ProductListResultNextLink() {
}

ProductListResultNextLink.prototype.mapper = function () {
  return {
    type: {
      name: 'Composite',
      className: 'ProductListResult',
      modelProperties: {
        value: {
          serializedName: '',
          required: false,
          type: {
            name: 'Sequence',
            element: {
              type: {
                name: 'Composite',
                className: 'Product'
              }
            }
          }
        },
        nextLink: {
          serializedName: 'nextLink',
          required: false,
          type: {
            name: 'String'
          }
        }
      }
    }
  };
}

module.exports = ProductListResultNextLink;
