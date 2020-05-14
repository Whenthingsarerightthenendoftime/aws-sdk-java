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
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/JobScopingBlock" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobScopingBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.List<JobScopeTerm> and;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public java.util.List<JobScopeTerm> getAnd() {
        return and;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param and
     *        Reserved for future use.
     */

    public void setAnd(java.util.Collection<JobScopeTerm> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<JobScopeTerm>(and);
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScopingBlock withAnd(JobScopeTerm... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<JobScopeTerm>(and.length));
        }
        for (JobScopeTerm ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param and
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScopingBlock withAnd(java.util.Collection<JobScopeTerm> and) {
        setAnd(and);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobScopingBlock == false)
            return false;
        JobScopingBlock other = (JobScopingBlock) obj;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        return hashCode;
    }

    @Override
    public JobScopingBlock clone() {
        try {
            return (JobScopingBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.JobScopingBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
