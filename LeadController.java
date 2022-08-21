package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.dto.LeadData;
import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {
	
	
	@Autowired
	private LeadService leadservice;
     
	
	//handler method
	@RequestMapping("/createlead")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		
		leadservice.saveLead(lead);
		model.addAttribute("msg","lead is saved");
		return "create_lead";
		
		
		
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadservice.listLeads();

		model.addAttribute("leads", leads);
		return"lead_search_result";
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id")long id, ModelMap model) {
		
		leadservice.deleteLeadById(id);
		List<Lead> leads = leadservice.listLeads();

		model.addAttribute("leads", leads);
		return"lead_search_result";
	}
	
	
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id")long id, ModelMap model) {
		Lead lead = leadservice.getOneLead(id);
		
		model.addAttribute("lead", lead);
		return "update_lead";
		
		
	}
	
	@RequestMapping("/updateLead")
	public String updateOneLeadData(LeadData data,ModelMap model) {
		Lead lead =new Lead();
		lead.setId(data.getId());
		lead.setFirstName(data.getFirstName());
		lead.setLastName(data.getLastName());
		lead.setEmail(data.getEmail());
	    lead.setMobile(data.getMobile());
		
	    leadservice.saveLead(lead);
	    List<Lead> leads = leadservice.listLeads();

		model.addAttribute("leads", leads);
		return"lead_search_result";
		
	}
	
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName")String fname, @RequestParam("lastName") String lName, @RequestParam("email") String email,@RequestParam("mobile")long mobile) {
//		Lead l =new Lead();
//	l.setFirstName(fname);
//	l.setLastName(lName);
//	l.setEmail(email);
//	l.setMobile(email);
//	
//	leadservice.saveLead(l);
//	return "create_lead";
//}
//	@RequestMapping("/saveLead")
//	public String saveOneLead(LeadData data,ModelMap model) {
//		Lead lead=new Lead();
//		lead.setFirstName(data.getFirstName());
//		lead.setLastName(data.getLastName());
//		lead.setEmail(data.getEmail());
//		lead.setMobile(data.getEmail());
//		leadservice.saveLead(lead);
//		model.addAttribute("msg","lead is saved");
//		return "create_lead";
//		
//		
//		
//		
//		
//	}
	
	
}