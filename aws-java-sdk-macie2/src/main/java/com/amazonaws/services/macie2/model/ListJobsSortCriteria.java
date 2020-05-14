/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies criteria for sorting the results of a request for information about classification jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/ListJobsSortCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsSortCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The sort order to apply to the results, based on the value for the property specified by the attributeName
     * property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending
     * order.
     * </p>
     */
    private String orderBy;

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * 
     * @param attributeName
     *        The property to sort the results by.
     * @see ListJobsSortAttributeName
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * 
     * @return The property to sort the results by.
     * @see ListJobsSortAttributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * 
     * @param attributeName
     *        The property to sort the results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListJobsSortAttributeName
     */

    public ListJobsSortCriteria withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The property to sort the results by.
     * </p>
     * 
     * @param attributeName
     *        The property to sort the results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListJobsSortAttributeName
     */

    public ListJobsSortCriteria withAttributeName(ListJobsSortAttributeName attributeName) {
        this.attributeName = attributeName.toString();
        return this;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the property specified by the attributeName
     * property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending
     * order.
     * </p>
     * 
     * @param orderBy
     *        The sort order to apply to the results, based on the value for the property specified by the attributeName
     *        property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in
     *        descending order.
     * @see OrderBy
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the property specified by the attributeName
     * property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending
     * order.
     * </p>
     * 
     * @return The sort order to apply to the results, based on the value for the property specified by the
     *         attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the
     *         results in descending order.
     * @see OrderBy
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the property specified by the attributeName
     * property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending
     * order.
     * </p>
     * 
     * @param orderBy
     *        The sort order to apply to the results, based on the value for the property specified by the attributeName
     *        property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in
     *        descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public ListJobsSortCriteria withOrderBy(String orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * The sort order to apply to the results, based on the value for the property specified by the attributeName
     * property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending
     * order.
     * </p>
     * 
     * @param orderBy
     *        The sort order to apply to the results, based on the value for the property specified by the attributeName
     *        property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in
     *        descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public ListJobsSortCriteria withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsSortCriteria == false)
            return false;
        ListJobsSortCriteria other = (ListJobsSortCriteria) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsSortCriteria clone() {
        try {
            return (ListJobsSortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ListJobsSortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
