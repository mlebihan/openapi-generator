/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Category } from '../models/Category.ts';
import { Tag } from '../models/Tag.ts';
import { HttpFile } from '../http/http.ts';

/**
* A pet for sale in the pet store
*/
export class Pet {
    'id'?: number;
    'category'?: Category;
    'name': string;
    'photoUrls': Array<string>;
    'tags'?: Array<Tag>;
    /**
    * pet status in the store
    */
    'status'?: PetStatusEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "category",
            "baseName": "category",
            "type": "Category",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "photoUrls",
            "baseName": "photoUrls",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<Tag>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "PetStatusEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Pet.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum PetStatusEnum {
    Available = 'available',
    Pending = 'pending',
    Sold = 'sold'
}

