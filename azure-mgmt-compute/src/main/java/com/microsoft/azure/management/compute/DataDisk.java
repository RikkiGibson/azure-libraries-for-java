/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.implementation.ManagedDiskParametersInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a data disk.
 */
public class DataDisk {
    /**
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The virtual hard disk.
     */
    @JsonProperty(value = "vhd")
    private VirtualHardDisk vhd;

    /**
     * The source user image virtual hard disk. The virtual hard disk will be
     * copied before being attached to the virtual machine. If SourceImage is
     * provided, the destination virtual hard drive must not exist.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /**
     * Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values
     * are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly**
     * &lt;br&gt;&lt;br&gt; **ReadWrite** &lt;br&gt;&lt;br&gt; Default: **None
     * for Standard storage. ReadOnly for Premium storage**. Possible values
     * include: 'None', 'ReadOnly', 'ReadWrite'.
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /**
     * Specifies how the virtual machine should be created.&lt;br&gt;&lt;br&gt;
     * Possible values are:&lt;br&gt;&lt;br&gt; **Attach** \u2013 This value is
     * used when you are using a specialized disk to create the virtual
     * machine.&lt;br&gt;&lt;br&gt; **FromImage** \u2013 This value is used
     * when you are using an image to create the virtual machine. If you are
     * using a platform image, you also use the imageReference element
     * described above. If you are using a marketplace image, you  also use the
     * plan element previously described. Possible values include: 'FromImage',
     * 'Empty', 'Attach'.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOptionTypes createOption;

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can
     * be used to overwrite the name of the disk in a virtual machine image.
     * &lt;br&gt;&lt;br&gt; This value cannot be larger than 1023 GB.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /**
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private ManagedDiskParametersInner managedDisk;

    /**
     * Get the lun value.
     *
     * @return the lun value
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun value.
     *
     * @param lun the lun value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vhd value.
     *
     * @return the vhd value
     */
    public VirtualHardDisk vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd value.
     *
     * @param vhd the vhd value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withVhd(VirtualHardDisk vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the caching value.
     *
     * @return the caching value
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching value.
     *
     * @param caching the caching value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled value.
     *
     * @return the writeAcceleratorEnabled value
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled value.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the createOption value.
     *
     * @return the createOption value
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption value.
     *
     * @param createOption the createOption value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diskSizeGB value.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB value.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk value.
     *
     * @return the managedDisk value
     */
    public ManagedDiskParametersInner managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk value.
     *
     * @param managedDisk the managedDisk value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withManagedDisk(ManagedDiskParametersInner managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

}
