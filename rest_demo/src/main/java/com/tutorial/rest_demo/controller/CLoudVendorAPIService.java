package com.tutorial.rest_demo.controller;

import com.tutorial.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CLoudVendorAPIService {

    public CloudVendor cloudVendor;

    @GetMapping("{vendor_id}")
    public CloudVendor getDetails(String vendor_id)
    {
        return cloudVendor;
    }

    @PostMapping
    public String getVendorDetail(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Successfull";
    }
    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Updated";
    }

    @DeleteMapping("{vendor_id}")
    public String deleteVendorDetails(String vendorID)
    {
        this.cloudVendor = null;
        return "Deleted";
    }

}
