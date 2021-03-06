
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_ADD_STANDARD_ICON"/>
 *     &lt;enumeration value="CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES"/>
 *     &lt;enumeration value="DUPLICATE_MEDIA"/>
 *     &lt;enumeration value="EMPTY_FIELD"/>
 *     &lt;enumeration value="ENTITY_REFERENCED_IN_MULTIPLE_OPS"/>
 *     &lt;enumeration value="FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE"/>
 *     &lt;enumeration value="INVALID_MEDIA_ID"/>
 *     &lt;enumeration value="INVALID_MEDIA_TYPE"/>
 *     &lt;enumeration value="INVALID_MEDIA_SUB_TYPE"/>
 *     &lt;enumeration value="INVALID_REFERENCE_ID"/>
 *     &lt;enumeration value="INVALID_YOU_TUBE_ID"/>
 *     &lt;enumeration value="YOU_TUBE_VIDEO_NOT_FOUND"/>
 *     &lt;enumeration value="YOU_TUBE_SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION"/>
 *     &lt;enumeration value="MEDIA_FAILED_TRANSCODING"/>
 *     &lt;enumeration value="MEDIA_NOT_TRANSCODED"/>
 *     &lt;enumeration value="MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE"/>
 *     &lt;enumeration value="NO_FIELDS_SPECIFIED"/>
 *     &lt;enumeration value="NULL_REFERENCE_ID_AND_MEDIA_ID"/>
 *     &lt;enumeration value="TOO_LONG"/>
 *     &lt;enumeration value="UNSUPPORTED_OPERATION"/>
 *     &lt;enumeration value="UNSUPPORTED_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaError.Reason")
@XmlEnum
public enum MediaErrorReason {


    /**
     * 
     *                 Cannot add a standard icon type
     *               
     * 
     */
    CANNOT_ADD_STANDARD_ICON,

    /**
     * 
     *                 May only select Standard Icons alone
     *               
     * 
     */
    CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES,

    /**
     * 
     *                 A media with given type and reference id already exists
     *               
     * 
     */
    DUPLICATE_MEDIA,

    /**
     * 
     *                 A required field was not specified or is an empty string.
     *               
     * 
     */
    EMPTY_FIELD,

    /**
     * 
     *                 A media may only be modified once per call
     *               
     * 
     */
    ENTITY_REFERENCED_IN_MULTIPLE_OPS,

    /**
     * 
     *                 Field is not supported for the media sub type.
     *               
     * 
     */
    FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE,

    /**
     * 
     *                 The media id is invalid
     *               
     * 
     */
    INVALID_MEDIA_ID,

    /**
     * 
     *                 The media type is invalid
     *               
     * 
     */
    INVALID_MEDIA_TYPE,

    /**
     * 
     *                 The media subtype is invalid
     *               
     * 
     */
    INVALID_MEDIA_SUB_TYPE,

    /**
     * 
     *                 The media reference id is invalid
     *               
     * 
     */
    INVALID_REFERENCE_ID,

    /**
     * 
     *                 The YouTube video id is invalid
     *               
     * 
     */
    INVALID_YOU_TUBE_ID,

    /**
     * 
     *                 The YouTube video id is syntactically valid but the video was not found.
     *               
     * 
     */
    YOU_TUBE_VIDEO_NOT_FOUND,

    /**
     * 
     *                 YouTube is unavailable for requesting video data.
     *               
     * 
     */
    YOU_TUBE_SERVICE_UNAVAILABLE,

    /**
     * 
     *                 The YouTube video has a non positive duration.
     *               
     * 
     */
    YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION,

    /**
     * 
     *                 Media has failed transcoding
     *               
     * 
     */
    MEDIA_FAILED_TRANSCODING,

    /**
     * 
     *                 Media has not been transcoded
     *               
     * 
     */
    MEDIA_NOT_TRANSCODED,

    /**
     * 
     *                 The MediaType does not match the actual media object's type
     *               
     * 
     */
    MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE,

    /**
     * 
     *                 None of the fields have been specified.
     *               
     * 
     */
    NO_FIELDS_SPECIFIED,

    /**
     * 
     *                 One of reference Id or media Id must be specified
     *               
     * 
     */
    NULL_REFERENCE_ID_AND_MEDIA_ID,

    /**
     * 
     *                 The string has too many characters.
     *               
     * 
     */
    TOO_LONG,

    /**
     * 
     *                 The specified operation is not supported.  Only ADD, SET, and REMOVE
     *                 are supported
     *               
     * 
     */
    UNSUPPORTED_OPERATION,
    UNSUPPORTED_TYPE;

    public String value() {
        return name();
    }

    public static MediaErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
