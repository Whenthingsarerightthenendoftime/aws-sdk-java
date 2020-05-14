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
 * Provides information about permissions settings that determine whether an S3 bucket is publicly accessible.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/BucketPublicAccess"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketPublicAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to
     * the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the bucket isn't
     * publicly accessible.
     * </p>
     */
    private String effectivePermission;
    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     */
    private BucketPermissionConfiguration permissionConfiguration;

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to
     * the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the bucket isn't
     * publicly accessible.
     * </p>
     * 
     * @param effectivePermission
     *        Specifies whether the bucket is publicly accessible due to the combination of permissions settings that
     *        apply to the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the
     *        bucket isn't publicly accessible.
     * @see EffectivePermission
     */

    public void setEffectivePermission(String effectivePermission) {
        this.effectivePermission = effectivePermission;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to
     * the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the bucket isn't
     * publicly accessible.
     * </p>
     * 
     * @return Specifies whether the bucket is publicly accessible due to the combination of permissions settings that
     *         apply to the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the
     *         bucket isn't publicly accessible.
     * @see EffectivePermission
     */

    public String getEffectivePermission() {
        return this.effectivePermission;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to
     * the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the bucket isn't
     * publicly accessible.
     * </p>
     * 
     * @param effectivePermission
     *        Specifies whether the bucket is publicly accessible due to the combination of permissions settings that
     *        apply to the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the
     *        bucket isn't publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectivePermission
     */

    public BucketPublicAccess withEffectivePermission(String effectivePermission) {
        setEffectivePermission(effectivePermission);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to
     * the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the bucket isn't
     * publicly accessible.
     * </p>
     * 
     * @param effectivePermission
     *        Specifies whether the bucket is publicly accessible due to the combination of permissions settings that
     *        apply to the bucket. Possible values are: PUBLIC, the bucket is publicly accessible; and, NOT_PUBLIC, the
     *        bucket isn't publicly accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectivePermission
     */

    public BucketPublicAccess withEffectivePermission(EffectivePermission effectivePermission) {
        this.effectivePermission = effectivePermission.toString();
        return this;
    }

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     * 
     * @param permissionConfiguration
     *        The account-level and bucket-level permissions for the bucket.
     */

    public void setPermissionConfiguration(BucketPermissionConfiguration permissionConfiguration) {
        this.permissionConfiguration = permissionConfiguration;
    }

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     * 
     * @return The account-level and bucket-level permissions for the bucket.
     */

    public BucketPermissionConfiguration getPermissionConfiguration() {
        return this.permissionConfiguration;
    }

    /**
     * <p>
     * The account-level and bucket-level permissions for the bucket.
     * </p>
     * 
     * @param permissionConfiguration
     *        The account-level and bucket-level permissions for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketPublicAccess withPermissionConfiguration(BucketPermissionConfiguration permissionConfiguration) {
        setPermissionConfiguration(permissionConfiguration);
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
        if (getEffectivePermission() != null)
            sb.append("EffectivePermission: ").append(getEffectivePermission()).append(",");
        if (getPermissionConfiguration() != null)
            sb.append("PermissionConfiguration: ").append(getPermissionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketPublicAccess == false)
            return false;
        BucketPublicAccess other = (BucketPublicAccess) obj;
        if (other.getEffectivePermission() == null ^ this.getEffectivePermission() == null)
            return false;
        if (other.getEffectivePermission() != null && other.getEffectivePermission().equals(this.getEffectivePermission()) == false)
            return false;
        if (other.getPermissionConfiguration() == null ^ this.getPermissionConfiguration() == null)
            return false;
        if (other.getPermissionConfiguration() != null && other.getPermissionConfiguration().equals(this.getPermissionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEffectivePermission() == null) ? 0 : getEffectivePermission().hashCode());
        hashCode = prime * hashCode + ((getPermissionConfiguration() == null) ? 0 : getPermissionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public BucketPublicAccess clone() {
        try {
            return (BucketPublicAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketPublicAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
