package com.example.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Action;
import com.example.demo.domain.AppendField;
import com.example.demo.domain.Campaign;
import com.example.demo.domain.Criteria;
import com.example.demo.domain.DaysBeforeNextContactPossible;
import com.example.demo.domain.FirstEligibleOffer;
import com.example.demo.domain.Methods;
import com.example.demo.domain.OfferPeriod;
import com.example.demo.domain.OfferTiming;
import com.example.demo.domain.Operator;
import com.example.demo.domain.OptInPeriod;
import com.example.demo.domain.PerformanceReporting;
import com.example.demo.domain.Segment;
import com.example.demo.domain.Segment1;
import com.example.demo.domain.SelectionMethodList;
import com.example.demo.domain.SubSegment;
import com.example.demo.domain.Trigger;
import com.example.demo.domain.Trigger1;
import com.example.demo.repository.CampaignRepository;



@SuppressWarnings({ "unused" })
@RestController
@RequestMapping("/campaign")
public class CampaignController {
	@Autowired
	private CampaignRepository campaignRepository;
	
	@SuppressWarnings({ "unused", "unchecked" })
	@GetMapping("/save")
	private void save()
	{
		JSONParser parser = new JSONParser();
		File folder = new File("C:\\Users\\nishu\\campaign(2).json");
		try {
			JSONObject obj = (JSONObject) parser.parse(new FileReader(folder));
			System.out.println(obj);
			Campaign campaign=new Campaign();
			
			JSONArray ja1=(JSONArray)obj.get("appendFields");
			List<AppendField> appendFields=new ArrayList<>();
			for(int i=0;i<ja1.size();i++)
			{
				AppendField ap=new AppendField();
				JSONObject jo1=(JSONObject) ja1.get(i);
				String name=(String) jo1.get("name");
				System.out.println(name);
				ap.setName(name);
				String value=(String) jo1.get("value");
				System.out.println(value);
				ap.setValue(value);
				@SuppressWarnings("unchecked")
				List<String> appendTo=(List<String>) jo1.get("AppendTos");
				System.out.println(appendTo);
				ap.setAppendTos(appendTo);
				appendFields.add(ap);
			}
			campaign.setApeendFields(appendFields);
			
			
			PerformanceReporting pr=new PerformanceReporting();
			JSONObject ob=(JSONObject) obj.get("performanceReporting");
			String baselinePeriod =(String) ob.get("baselinePeriod");
			pr.setBaselinePeriod(baselinePeriod);
			String reportingPeriod=(String) obj.get("reportingPeriod");
			pr.setReportingPeriod(reportingPeriod);
			
			
			ja1=(JSONArray)obj.get("triggers");
			List<Trigger> triggers=new ArrayList<>();
			for(int i=0;i<ja1.size();i++)
			{
				Trigger tr=new Trigger();
				JSONObject jo1=(JSONObject) ja1.get(i);
				String type=(String) jo1.get("type");
				System.out.println(type);
				tr.setType(type);
				String triggerId=(String) jo1.get("triggerId");
				System.out.println(triggerId);
				tr.setTriggerId(triggerId);
				String name=(String) jo1.get("name");
				System.out.println(name);
				tr.setName(name);
				String desc=(String) jo1.get("description");
				System.out.println(desc);
				tr.setDescription(desc);
				String version=(String) jo1.get("triggerVersion");
				System.out.println(version);
				tr.setTriggerVersion(version);
				triggers.add(tr);
			}
			campaign.setTriggers(triggers);
			
			ja1=(JSONArray)obj.get("segments");
			List<Segment> segements=new ArrayList<>();
			for(int i=0;i<ja1.size();i++)
			{
				Segment seg=new Segment();
				JSONObject job=(JSONObject) ja1.get(i);
				boolean updatable=(Boolean) job.get("updatable");
				System.out.println(updatable);
				seg.setUpdatable(updatable);
				
				boolean deletable=(Boolean) job.get("deletable");
				System.out.println(deletable);
				seg.setDeletable(deletable);
				
				boolean archivable=(Boolean) job.get("archivable");
				System.out.println(archivable);
				seg.setArchivable(archivable);
				
				boolean versionable=(Boolean) job.get("versionable");
				System.out.println(versionable);
				seg.setDeletable(deletable);
				
				boolean copyable=(Boolean)job.get("copyable");
				System.out.println(copyable);
				seg.setCopyable(copyable);
				
				boolean publishable=(Boolean) job.get("publishable");
				System.out.println(publishable);
				seg.setPublishable(publishable);
				
				boolean renamable=(Boolean) job.get("renamable");
				System.out.println(renamable);
				seg.setRenamable(renamable);
				
				boolean availableInLibrary=(Boolean)job.get("availableInLibrary");
				System.out.println(availableInLibrary);
				seg.setAvailabileInLibrary(availableInLibrary);
				
				String id=(String) job.get("id");
				System.out.println(id);
				seg.setId(id);
				
				String name=(String) job.get("name");
				System.out.println(name);
				seg.setName(name);
				
				String desc=(String) job.get("description");
				System.out.println(desc);
				seg.setDescription(desc);
				
				String status=(String) job.get("status");
				System.out.println(status);
				seg.setStatus(status);
				
				String sortableId=(String) job.get("sortableId");
				seg.setSortableId(sortableId);
				
				@SuppressWarnings("unchecked")
				List<String> AppFields=(List<String>) job.get("appendFields");
				seg.setAppendFields(AppFields);
				
				String priorityId1=(String) job.get("priorityId");
				seg.setPriorityId(priorityId1);
				
				
				JSONArray ja2=(JSONArray)job.get("subSegments");
				List<SubSegment> subSegs=new ArrayList<>();
				for(int j=0;j<ja2.size();j++)
				{
					SubSegment s=new SubSegment();
					JSONObject job1=(JSONObject) ja2.get(i);
					
					JSONArray jaa=(JSONArray)job.get("triggers");
					List<Trigger1>triggers1=new ArrayList<>();
					for(int k=0;k<jaa.size();k++)
					{
						Trigger1 tr1=new Trigger1();
						JSONObject j1=(JSONObject) jaa.get(k);
						String type=(String) j1.get("type");
						System.out.println(type);
						tr1.setType(type);
						String triggerId=(String) j1.get("triggerId");
						System.out.println(triggerId);
						tr1.setTriggerid(triggerId);
						String name1=(String) j1.get("name"); 
						System.out.println(name1);
						tr1.setName(name1);
						triggers1.add(tr1);
					}
					s.setTriggers(triggers1);
					
					jaa=(JSONArray)job.get("criteria");
					List<Criteria> criterias=new ArrayList<>();
					for(int k=0;k<jaa.size();k++)
					{
						Criteria cr=new Criteria();
						JSONObject j1=(JSONObject) jaa.get(k);
						int id1=(Integer) j1.get("sortableId");
						System.out.println(id1);
						cr.setSortableId(id1);
						String name1=(String) j1.get("name");
						System.out.println(name);
						cr.setName(name1);
						String type=(String) j1.get("type");
						System.out.println(type);
						cr.setType(type);
						String label=(String) j1.get("label");
						System.out.println(label);
						cr.setLabel(label);
						String source=(String) j1.get("source");
						System.out.println(source);
						cr.setSource(source);
						String priorityId11=(String) j1.get("priorityId");
						cr.setPriorityId(priorityId11);
						
						JSONArray jaa1=(JSONArray) j1.get("operators");
						List<Operator> operators=new ArrayList<>();
						for(int l=0;l<jaa1.size();l++)
						{
							Operator op=new Operator();
							JSONObject j11=(JSONObject) jaa1.get(l);
							int id11=(Integer) j11.get("sortableId");
							System.out.println(id11);
							op.setSortableId(id11);
							String name11=(String) j11.get("name");
							System.out.println(name11);
							op.setName(name11);
							String value11=(String) j11.get("value");
							System.out.println(value11);
							op.setValue(value11);
							String SelectedVal=(String)j11.get("selectedVal");
							System.out.println(SelectedVal);
							op.setSelectedVal(SelectedVal);
							String exp=(String)j11.get("expression");
							op.setExpression(exp);
							String type11=(String)j11.get("type");
							op.setType(type11);
							String priorityId=(String)j11.get("priorityId");
							op.setPrirityId(priorityId);
							operators.add(op);
							
						}
						cr.setOperators(operators);
					}
					subSegs.add(s);
				}
				seg.setSubsegments(subSegs);
				
				
			}
			ja1=(JSONArray)obj.get("actions");
			List<Action> actions=new ArrayList<>();
			for(int i=0;i<ja1.size();i++)
			{
				Action ac=new Action();
				JSONObject job=(JSONObject) ja1.get(i);
				boolean updatable=(Boolean) job.get("updatable");
				System.out.println(updatable);
				ac.setUpdatable(updatable);
				
				boolean deletable=(Boolean) job.get("deletable");
				System.out.println(deletable);
				ac.setDeletable(deletable);
				
				boolean archivable=(Boolean) job.get("archivable");
				System.out.println(archivable);
				ac.setArchivable(archivable);
				
				boolean versionable=(Boolean) job.get("versionable");
				System.out.println(versionable);
				ac.setDeletable(deletable);
				
				boolean copyable=(Boolean)job.get("copyable");
				System.out.println(copyable);
				ac.setCopyable(copyable);
				
				boolean publishable=(Boolean) job.get("publishable");
				System.out.println(publishable);
				ac.setPublishable(publishable);
				
				boolean renamable=(Boolean) job.get("renamable");
				System.out.println(renamable);
				ac.setRenamable(renamable);
				
				boolean availableInLibrary=(Boolean)job.get("availableInLibrary");
				System.out.println(availableInLibrary);
				ac.setAvailabileInLibrary(availableInLibrary);
				
				String id=(String) job.get("id");
				System.out.println(id);
				ac.setId(id);
				
				String name=(String) job.get("name");
				System.out.println(name);
				ac.setName(name);
				
				String desc=(String) job.get("description");
				System.out.println(desc);
				ac.setDescription(desc);
				
				String category=(String) job.get("category");
				System.out.println(category);
				ac.setCategory(category);
				
				String subCat=(String) job.get("subCategory");
				System.out.println(subCat);
				ac.setSubCategory(subCat);
				
				String perm=(String)job.get("permissionCategory");
				System.out.println(perm);
				ac.setPermissionCategory(perm);
				
				String exp=(String)job.get("userFriendlyExpression");
				System.out.println(exp);
				ac.setUserFriendlyExpression(exp);
				
				@SuppressWarnings("unchecked")
				List<String> jaa=(List<String>)job.get("criteria");
				ac.setCriteria(jaa);
				
				JSONArray jaa1=(JSONArray)job.get("triggers");
				List<Trigger1>triggers1=new ArrayList<>();
				for(int i1=0;i1<jaa1.size();i1++)
				{
					Trigger1 tr1=new Trigger1();
					JSONObject j1=(JSONObject)jaa1.get(i1);
					String type=(String) j1.get("type");
					System.out.println(type);
					tr1.setType(type);
					String triggerId=(String) j1.get("triggerId");
					System.out.println(triggerId);
					tr1.setTriggerid(triggerId);
					String name1=(String) j1.get("name"); 
					System.out.println(name1);
					tr1.setName(name1);
					triggers1.add(tr1);
				}
				ac.setTriggers(triggers1);
				
				jaa1=(JSONArray) job.get("segments");
				List<Segment1> segs=new ArrayList<>();
				for(int i1=0;i<jaa1.size();i++)
				{
					Segment1 seg=new Segment1();
					JSONObject j1=(JSONObject)jaa1.get(i);
					String name1=(String) j1.get("name");
					System.out.println(name1);
					seg.setName(name1);
					int id1=(Integer) j1.get("segmentId");
					System.out.println(id1);
					seg.setSegmentId(id1);
					segs.add(seg);
				}
				ac.setSgements(segs);
				
				String as=(String)job.get("actionsSchedule");
				System.out.println(as);
				ac.setActionSchedule(as);
				
				JSONObject job1=(JSONObject) job.get("offerTiming");
				OfferPeriod op=new OfferPeriod();
				OfferTiming ot=new OfferTiming();
				JSONObject op1=(JSONObject) job1.get("offerPeriod");
				String midnight=(String) op1.get("midnight");
				op.setMidnight(midnight);
				int value=(Integer) op1.get("value");
				op.setValue(value);
				String unit=(String)op1.get("unit");
				op.setUnit(unit);
				String time=(String) op1.get("time");
				op.setTime(time);
				ot.setOfferPeriod(op);
				
				
				op1=(JSONObject) job1.get("optInPeriod");
				OptInPeriod op2=new OptInPeriod();
				midnight=(String) op1.get("midnight");
				op2.setMidnight(midnight);
				String value1=(String) op1.get("value");
				op2.setValue(value1);
				unit=(String)op1.get("unit");
				op2.setUnit(unit);
				time=(String) op1.get("time");
				op2.setTime(time);
				ot.setOptInPeriod(op2);
				
				op1=(JSONObject) job1.get("reminderPeriod");
				OptInPeriod op22=new OptInPeriod();
				midnight=(String) op1.get("midnight");
				op22.setMidnight(midnight);
				String value11=(String) op1.get("value");
				op22.setValue(value11);
				unit=(String)op1.get("unit");
				op22.setUnit(unit);
				time=(String) op1.get("time");
				op22.setTime(time);
				ot.setReminderPeriod(op22);
				
				op1=(JSONObject) job1.get("daysBeforeNextContactPossible");
				DaysBeforeNextContactPossible d1=new DaysBeforeNextContactPossible();
				midnight=(String) op1.get("midnight");
				d1.setMidnight(midnight);
				String value111=(String) op1.get("value");
				d1.setValue(value111);
				unit=(String)op1.get("unit");
				d1.setUnit(unit);
				ot.setDaysBeforeNextContactPossible(d1);
				
				
				op1=(JSONObject) job1.get("daysBeforeNextContactPossible");
				DaysBeforeNextContactPossible d11=new DaysBeforeNextContactPossible();
				midnight=(String) op1.get("midnight");
				d1.setMidnight(midnight);
				String value1111=(String) op1.get("value");
				d1.setValue(value1111);
				unit=(String)op1.get("unit");
				d1.setUnit(unit);
				ot.setDaysBeforeOfferCanBeRepeated(d11);
				
				op1=(JSONObject) job1.get("persistencyPeriod");
				DaysBeforeNextContactPossible d111=new DaysBeforeNextContactPossible();
				midnight=(String) op1.get("midnight");
				d1.setMidnight(midnight);
				String value11111=(String) op1.get("value");
				d1.setValue(value11111);
				unit=(String)op1.get("unit");
				d1.setUnit(unit);
				ot.setPersistencyPeriod(d111);
				ac.setOfferTiming(ot);
				
				List<String> stl=new ArrayList<>();
				JSONArray ja3=(JSONArray) job.get("channels");
				for(int j=0;j<ja3.size();j++)
				{
					String str=(String) ja3.get(j);
					stl.add(str);
				}
				ac.setChannels(stl);
				
				String j=(String) job.get("quotas");
				ac.setQuotas(j);
				
				j=(String) job.get("boostedControl");
				ac.setBoostedControl(j);
				
				stl=(List<String>)job.get("appendFields");
				ac.setAppendFields(stl);
				
				stl=(List<String>)job.get("subActions");
				ac.setSubAction(stl);
				
				String s=(String)job.get("qualifyingEffortExpression");
				ac.setQualifyingEffortExpression(s);
				
				s=(String)job.get("priorityId");
				ac.setPriorityId(s);
				
			}
			JSONObject job=(JSONObject)obj.get("selectionMethodList");
			SelectionMethodList sml=new SelectionMethodList();
			JSONObject m1=(JSONObject)obj.get("methods");
			Methods m=new Methods();
			String id=(String) m1.get("id");
			m.setId(id);
			boolean random=(boolean) m1.get("random");
			m.setRandom(random);
			
			JSONObject feo1=(JSONObject) m1.get("firstEligibleOffer");
			FirstEligibleOffer feo=new FirstEligibleOffer();
			int random1=(Integer) feo1.get("random");
			feo.setRandom(random1);
			List<String> stl=(List<String>) feo1.get("criteria");
			feo.setCriteria(stl);
			stl=(List<String>) feo1.get("persistency");
			feo.setPersistency(stl);
			boolean bool=(boolean) feo1.get("offerAccepted");
			feo.setOfferAccepted(bool);
			bool=(boolean) feo1.get("persistencyFlag");
			feo.setPersistencyFlag(bool);
			bool=(boolean) feo1.get("sendToExecutionWorkflow");
			feo.setSendToExecutionWorkFlow(bool);
			String s=(String)feo1.get("appendUpdateOffer");
			feo.setAppendUpdateOffer(s);
			m.setFirstEligibleOffer(feo);
			
			s=(String) m1.get("nboModel");
			m.setNboModel(s);		
			s=(String) m1.get("nboModelWithBalanceCheck");
			m.setNboModelWithBalanceCheck(s);
			s=(String) m1.get("randomSelectionMethod");
			m.setRandomSelectionMethod(s);
			s=(String) m1.get("highestPriorityOfferByParent");
			m.setHighestPriorityOfferByParent(s);
			s=(String) m1.get("highestPriorityOfferMultiple");
			m.setHighestPriorityOfferMultiple(s);
			sml.setMethods(m);
			campaign.setSelectionMethodList(sml);
			
			List<String> ewfl=(List<String>) obj.get("executionWorkflowList");
			campaign.setExecutionWorkFlowList(ewfl);
			
			String label=(String) obj.get("label");
			campaign.setLabel(label);
			
			int rv=(Integer)obj.get("restoreVersion");
			campaign.setRestoreVersion(rv);
			
			String s1=(String) obj.get("category");
			campaign.setCategory(s1);
			
			ZonedDateTime zdt=(ZonedDateTime) obj.get("createdDateAndTime");
			campaign.setCreatedDateAndTime(zdt);
			zdt=(ZonedDateTime) obj.get("updatedDateAndTime");
			campaign.setUpdatedDateAndTime(zdt);
			
			s1=(String) obj.get("createdBy");
			campaign.setCreatedBy(s1);
			
			s1=(String) obj.get("modifiedBy");
			campaign.setModifiedBy(s1);
			
			s1=(String) obj.get("usecaseVersion");
			campaign.setUsecaseVersion(s1);
			
			int micro=(Integer)obj.get("micro");
			campaign.setMicro(micro);
			
			s1=(String) obj.get("dataChanged");
			campaign.setDateChanged(s1);
			
			int uid=(Integer)obj.get("usecaseId");
			campaign.setUsecaseId(uid);
			
			boolean updatable=(Boolean) obj.get("updatable");
			System.out.println(updatable);
			campaign.setUpdatable(updatable);
			
			boolean deletable=(Boolean) obj.get("deletable");
			System.out.println(deletable);
			campaign.setDeletable(deletable);
			
			boolean archivable=(Boolean) obj.get("archivable");
			System.out.println(archivable);
			campaign.setArchivable(archivable);
			
			boolean versionable=(Boolean) obj.get("versionable");
			System.out.println(versionable);
			campaign.setDeletable(deletable);
			
			boolean copyable=(Boolean) obj.get("copyable");
			System.out.println(copyable);
			campaign.setCopyable(copyable);
			
			boolean publishable=(Boolean) obj.get("publishable");
			System.out.println(publishable);
			campaign.setPublishable(publishable);
			
			boolean renamable=(Boolean) obj.get("renamable");
			System.out.println(renamable);
			campaign.setRenamable(renamable);
			
			boolean availableInLibrary=(Boolean) obj.get("availableInLibrary");
			System.out.println(availableInLibrary);
			campaign.setAvailabileInLibrary(availableInLibrary);
			
			String id1=(String) obj.get("id");
			System.out.println(id1);
			campaign.setId(id1);
			
			String name=(String) obj.get("name");
			System.out.println(name);
			campaign.setName(name);
			
			String desc=(String) obj.get("description");
			System.out.println(desc);
			campaign.setDescription(desc);
			
			Date startDate=(Date) obj.get("startDate");
			System.out.println(startDate);
			campaign.setStartDate(startDate);
			
			Date endDate=(Date) obj.get("endDate");
			System.out.println(endDate);
			campaign.setEndDate(endDate);
			
			double version=(double) obj.get("version");
			System.out.println(version);
			campaign.setVersion(version);
			
			String state=(String) obj.get("state");
			System.out.println(state);
			campaign.setState(state);
			
			String status=(String) obj.get("status");
			System.out.println(status);
			campaign.setStatus(status);
			
			String environment=(String) obj.get("environment");
			System.out.println(environment);
			campaign.setEnvironment(environment);
			
			

		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	

}
