//
// EnumTest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

internal struct EnumTest: Sendable, Codable, ParameterConvertible {

    internal enum EnumString: String, Sendable, Codable, CaseIterable, CaseIterableDefaultsLast {
        case upper = "UPPER"
        case lower = "lower"
        case empty = ""
        case unknownDefaultOpenApi = "unknown_default_open_api"
    }
    internal enum EnumStringRequired: String, Sendable, Codable, CaseIterable, CaseIterableDefaultsLast {
        case upper = "UPPER"
        case lower = "lower"
        case empty = ""
        case unknownDefaultOpenApi = "unknown_default_open_api"
    }
    internal enum EnumInteger: Int, Sendable, Codable, CaseIterable, CaseIterableDefaultsLast {
        case _1 = 1
        case number1 = -1
        case unknownDefaultOpenApi = 11184809
    }
    internal enum EnumNumber: Double, Sendable, Codable, CaseIterable, CaseIterableDefaultsLast {
        case _11 = 1.1
        case number12 = -1.2
        case unknownDefaultOpenApi = 11184809
    }
    internal private(set) var enumString: EnumString?
    internal private(set) var enumStringRequired: EnumStringRequired
    internal private(set) var enumInteger: EnumInteger?
    internal private(set) var enumNumber: EnumNumber?
    internal private(set) var outerEnum: OuterEnum?

    internal init(enumString: EnumString? = nil, enumStringRequired: EnumStringRequired, enumInteger: EnumInteger? = nil, enumNumber: EnumNumber? = nil, outerEnum: OuterEnum? = nil) {
        self.enumString = enumString
        self.enumStringRequired = enumStringRequired
        self.enumInteger = enumInteger
        self.enumNumber = enumNumber
        self.outerEnum = outerEnum
    }

    internal enum CodingKeys: String, CodingKey, CaseIterable {
        case enumString = "enum_string"
        case enumStringRequired = "enum_string_required"
        case enumInteger = "enum_integer"
        case enumNumber = "enum_number"
        case outerEnum
    }

    // Encodable protocol methods

    internal func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(enumString, forKey: .enumString)
        try container.encode(enumStringRequired, forKey: .enumStringRequired)
        try container.encodeIfPresent(enumInteger, forKey: .enumInteger)
        try container.encodeIfPresent(enumNumber, forKey: .enumNumber)
        try container.encodeIfPresent(outerEnum, forKey: .outerEnum)
    }
}

