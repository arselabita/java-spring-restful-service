package com.javagroup.javaspringrestfulservice.controller;

import com.javagroup.javaspringrestfulservice.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for managing RESTful API endpoints related to cloud vendors.
 * This class provides endpoints for retrieving, creating, updating, and deleting cloud vendor records.
 */


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    // CloudVendor object to store vendor details
    CloudVendor cloudVendor;

    //GET endpoint to retrieve cloud vendor details by vendor ID
    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails (String vendorId)
    {
        //Return cloudVendor object
        return cloudVendor;
               // new CloudVendor("C1", "Vendor 1",
                //"Address One", "xxxxx");
    }

    //POST endpoint to create a new cloud vendor record
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        //Set the recieved cloudVendor object (replace with the actual implementation)
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    //PUT endpoint to update an existing cloud vendor record
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        //Update the cloudVendor with the received data
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    //DELETE endpoint to delete a cloud vendor record by vendor ID
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        //Set cloudVendor object to null
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }


}
