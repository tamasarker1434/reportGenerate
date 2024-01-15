package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/")
public class ReportResource {

    ReportServices reportServices = new ReportServices();
    @Path("/report/customer/{cid}")
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Payment> CustomerReports(@PathParam("cid")  String cid) {
        return reportServices.getAllReportCustomer(cid);
    }
    @Path("/report/merchant/{mid}")
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Payment> MerchantReports(@PathParam("mid")  String mid) {
        return reportServices.getAllReportMarchant(mid);
    }
    @Path("/report/dtupay")
    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Payment> DTUPayReports() {
        return reportServices.getAllReportDTUPay();
    }

}
