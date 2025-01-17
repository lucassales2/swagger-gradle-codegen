/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.time.LocalDate
import java.time.ZonedDateTime

/**
 * @property dateProperty
 * @property datetimeProperty
 * @property enumProperty
 */
@JsonClass(generateAdapter = true)
data class FormatResponses(
    @Json(name = "date_property") @field:Json(name = "date_property") val dateProperty: LocalDate? = null,
    @Json(name = "datetime_property") @field:Json(name = "datetime_property") val datetimeProperty: ZonedDateTime? = null,
    @Json(name = "enum_property") @field:Json(name = "enum_property") val enumProperty: FormatResponses.EnumPropertyEnum? = null
) {
    /**
     * Values: VALUE1, VALUE2
     */
    @JsonClass(generateAdapter = false)
    enum class EnumPropertyEnum(val value: String) {
        @Json(name = "VALUE1") VALUE1("VALUE1"),
        @Json(name = "VALUE2") VALUE2("VALUE2")
    }
}
