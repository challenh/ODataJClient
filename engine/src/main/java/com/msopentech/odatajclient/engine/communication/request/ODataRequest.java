/*
 * Copyright 2013 MS OpenTech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.msopentech.odatajclient.engine.communication.request;

import com.msopentech.odatajclient.engine.types.ODataFormat;
import java.net.URI;
import java.util.Collection;

/**
 * Abstract representation of an OData request.
 * Get instance by using ODataRequestFactory.
 *
 * @see ODataRequestFactory.
 */
public interface ODataRequest {

    /**
     * Supported HTTP methods.
     */
    public enum Method {

        NONE,
        GET,
        POST,
        DELETE,
        PUT,
        PATCH,
        MERGE

    }

    /**
     * Returns resource representation format.
     *
     * @return the configured format (<code>Atom</code> will be the default value unless differently specified).
     */
    ODataFormat getFormat();

    /**
     * Override configured request format.
     *
     * @param format request format.
     *
     * @see ODataFormat
     */
    void setFormat(final ODataFormat format);

    /**
     * Returns OData request target URI.
     *
     * @return OData request target URI.
     */
    URI getURI();

    /**
     * Gets all OData request header names.
     *
     * @return all request header names.
     */
    Collection<String> getHeaderNames();

    /**
     * Gets the value of the OData request header identified by the given name.
     *
     * @param name name of the OData request header to be retrieved.
     * @return header value.
     */
    String getHeader(final String name);

    /**
     * Adds
     * <code>MaxDataServiceVersion</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#maxDataServiceVersion
     */
    void setMaxDataServiceVersion(final String value);

    /**
     * Gets
     * <code>MaxDataServiceVersion</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#maxDataServiceVersion
     */
    String getMaxDataServiceVersion();

    /**
     * Adds
     * <code>MinDataServiceVersion</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#minDataServiceVersion
     */
    void setMinDataServiceVersion(final String value);

    /**
     * Gets
     * <code>MinDataServiceVersion</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#minDataServiceVersion
     */
    String getMinDataServiceVersion();

    /**
     * Adds
     * <code>Accept</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#accept
     */
    void setAccept(final String value);

    /**
     * Gets
     * <code>Accept</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#accept
     */
    String getAccept();

    /**
     * Adds
     * <code>If-Match</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#ifMatch
     */
    void setIfMatch(final String value);

    /**
     * Gets
     * <code>If-Match</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#ifMatch
     */
    String getIfMatch();

    /**
     * Adds
     * <code>If-None-Match</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#ifNoneMatch
     */
    void setIfNoneMatch(final String value);

    /**
     * Gets
     * <code>If-None-Match</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#ifNoneMatch
     */
    String getIfNoneMatch();

    /**
     * Adds
     * <code>Prefer</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#prefer
     */
    void setPrefer(final String value);

    /**
     * Gets
     * <code>Prefer</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#prefer
     */
    String getPrefer();

    /**
     * Adds
     * <code>contentType</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#contentType
     */
    void setContentType(final String value);

    /**
     * Gets
     * <code>contentType</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#contentType
     */
    String getContentType();

    /**
     * Adds
     * <code>dataServiceVersion</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#dataServiceVersion
     */
    void setDataServiceVersion(final String value);

    /**
     * Gets
     * <code>dataServiceVersion</code> OData request header.
     *
     * @return header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#dataServiceVersion
     */
    String getDataServiceVersion();

    /**
     * Adds
     * <code>X-HTTP-METHOD</code> OData request header.
     *
     * @param value header value.
     * @see com.msopentech.odatajclient.engine.communication.header.ODataHeader.HeaderName#xHttpMethod
     */
    void setHTTPMethod(final String value);

    /**
     * Adds a custom OData request header.
     *
     * @param name header name.
     * @param value header value.
     */
    void addCustomHeader(final String name, final String value);

    byte[] toByteArray();
}
