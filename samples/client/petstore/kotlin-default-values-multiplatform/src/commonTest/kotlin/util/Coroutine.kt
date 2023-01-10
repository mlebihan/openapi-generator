/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)


package util

import kotlinx.coroutines.CoroutineScope

/**
* Block the current thread until execution of the given coroutine is complete.
*
* @param block The coroutine code.
* @return The result of the coroutine.
*/
internal expect fun <T> runTest(block: suspend CoroutineScope.() -> T): T