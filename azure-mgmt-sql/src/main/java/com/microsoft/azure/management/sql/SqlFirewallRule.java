/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.apigeneration.Method;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.arm.models.ExternalChildResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.management.sql.implementation.FirewallRuleInner;
import rx.Completable;

/**
 * An immutable client-side representation of an Azure SQL Server Firewall Rule.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_7_0)
public interface SqlFirewallRule
    extends
        ExternalChildResource<SqlFirewallRule, SqlServer>,
        HasInner<FirewallRuleInner>,
        HasResourceGroup,
        Refreshable<SqlFirewallRule>,
        Updatable<SqlFirewallRule.Update> {

    /**
     * @return name of the SQL Server to which this Firewall Rule belongs
     */
    String sqlServerName();

    /**
     * @return the start IP address (in IPv4 format) of the Azure SQL Server Firewall Rule.
     */
    String startIPAddress();

    /**
     * @return the end IP address (in IPv4 format) of the Azure SQL Server Firewall Rule.
     */
    String endIPAddress();

    /**
     * @return kind of SQL Server that contains this Firewall Rule.
     */
    String kind();

    /**
     * @return region of SQL Server that contains this Firewall Rule.
     */
    Region region();

    /**
     * @return the parent SQL server ID
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    String parentId();

    /**
     * Deletes the firewall rule.
     */
    @Method
    void delete();

    /**
     * Deletes the firewall rule asynchronously.
     *
     * @return a representation of the deferred computation of this call
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    @Method
    Completable deleteAsync();


    /**************************************************************
     * Fluent interfaces to provision a SQL Firewall Rule
     **************************************************************/

    /**
     * Container interface for all the definitions that need to be implemented.
     *
     * @param <ParentT> the stage of the parent definition to return to after attaching this definition
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface SqlFirewallRuleDefinition<ParentT> extends
            SqlFirewallRule.DefinitionStages.Blank<ParentT>,
            SqlFirewallRule.DefinitionStages.WithIPAddress<ParentT>,
            SqlFirewallRule.DefinitionStages.WithIPAddressRange<ParentT>,
            SqlFirewallRule.DefinitionStages.WithAttach<ParentT> {
    }

    /**
     * Grouping of all the SQL Firewall Rule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SQL Server Firewall Rule definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface Blank<ParentT> extends
            SqlFirewallRule.DefinitionStages.WithIPAddressRange<ParentT>,
            SqlFirewallRule.DefinitionStages.WithIPAddress<ParentT> {
        }

        /**
         * The SQL Firewall Rule definition to set the IP address range for the parent SQL Server.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithIPAddressRange<ParentT> {
            /**
             * Sets the starting IP address of SQL server's Firewall Rule.
             *
             * @param startIPAddress starting IP address in IPv4 format.
             * @param endIPAddress   starting IP address in IPv4 format.
             * @return The next stage of the definition.
             */
            WithAttach<ParentT> withIPAddressRange(String startIPAddress, String endIPAddress);
        }

        /**
         * The SQL Firewall Rule definition to set the IP address for the parent SQL Server.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithIPAddress<ParentT> {
            /**
             * Sets the ending IP address of SQL server's Firewall Rule.
             *
             * @param ipAddress IP address in IPv4 format.
             * @return The next stage of the definition.
             */
            WithAttach<ParentT> withIPAddress(String ipAddress);
        }

        /** The final stage of the SQL Firewall Rule definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the SQL Firewall Rule definition
         * can be attached to the parent SQL Server definition.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithAttach<ParentT> extends
            Attachable.InDefinition<ParentT> {
        }
    }

    /**
     * The template for a SQL Firewall Rule update operation, containing all the settings that can be modified.
     */
    interface Update extends
            UpdateStages.WithEndIPAddress,
            UpdateStages.WithStartIPAddress,
            Appliable<SqlFirewallRule> {
    }

    /**
     * Grouping of all the SQL Firewall Rule update stages.
     */
    interface UpdateStages {
        /**
         * The SQL Firewall Rule definition to set the starting IP Address for the server.
         */
        interface WithStartIPAddress {
            /**
             * Sets the starting IP address of SQL server's Firewall Rule.
             *
             * @param startIPAddress start IP address in IPv4 format.
             * @return The next stage of the update.
             */
            Update withStartIPAddress(String startIPAddress);
        }

        /**
         * The SQL Firewall Rule definition to set the starting IP Address for the server.
         */
        interface WithEndIPAddress {
            /**
             * Sets the ending IP address of SQL server's Firewall Rule.
             *
             * @param endIPAddress end IP address in IPv4 format.
             * @return The next stage of the update.
             */
            Update withEndIPAddress(String endIPAddress);
        }
    }
}
