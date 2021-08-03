package com.example.demo.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.StudentRepository;
//import com.example.demo.Service.service;
import com.example.demo.domain.Marks;
import com.example.demo.domain.Student;
import com.example.demo.domain.Subject;
import com.example.demo.domain.Teacher;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//@Autowired service serv;

	@SuppressWarnings("rawtypes")
	@GetMapping("/save")
	public void save() {
		JSONParser parser = new JSONParser();
		File folder = new File("C:\\Users\\nishu\\student.json");
		//Student student=new Student();
		try {
			JSONArray obj = (JSONArray) parser.parse(new FileReader(folder));
			System.out.println(obj);
			Iterator itr2 = obj.iterator();
			List<Student> students=new ArrayList<>();
			
			while(itr2.hasNext())
			{
				Student stud=new Student();
				JSONObject jo=(JSONObject) itr2.next();//student object
				
				JSONArray ja1=(JSONArray)jo.get("teachers");
				List<Teacher> teachers=new ArrayList<>();
				Iterator itr3 = ja1.iterator();
				while(itr3.hasNext())
				{
					Teacher teacher=new Teacher();
					JSONObject jo1=(JSONObject) itr3.next();
					int t_id=((Number)jo1.get("t_id")).intValue();
					System.out.println(t_id);
					teacher.setT_id(t_id);
					String t_name=(String) jo1.get("t_name");
					System.out.println(t_name);
					teacher.setT_name(t_name);
					System.out.println("t11111111111  "+teacher);
					teachers.add(teacher);
				}
				System.out.println(teachers.toString());
				stud.setTeachers(teachers);
				
				
				JSONArray ja=(JSONArray)jo.get("subjects");
				List<Subject> subjects=new ArrayList<>();
				for(int i=0;i<ja.size();i++)
				{
					Subject subject=new Subject();
					JSONObject jo1=(JSONObject) ja.get(i);
					String sub_id=(String) jo1.get("sub_id");
					System.out.println(sub_id);
					subject.setId(sub_id);
					String sub_name=(String) jo1.get("sub_name");
					System.out.println(sub_name);
					subject.setSub_name(sub_name);
					System.out.println("s  "+subject);
					subjects.add(subject);
				}
				System.out.println(subjects);
				stud.setSubjects(subjects);
//				JSONArray ja1=(JSONArray)jo.get("teachers");
//				List<Teacher> teachers=new ArrayList<>();
//				Iterator itr3 = ja1.iterator();
//				while(itr3.hasNext())
//				{
//					Teacher teacher=new Teacher();
//					JSONObject jo1=(JSONObject) itr3.next();
//					int t_id=((Number)jo1.get("t_id")).intValue();
//					System.out.println(t_id);
//					teacher.setT_id(t_id);
//					String t_name=(String) jo1.get("t_name");
//					System.out.println(t_name);
//					teacher.setT_name(t_name);
//					teachers.add(teacher);
//				}
//				stud.setTeachers(teachers);
				Marks mark=new Marks();
				JSONObject marks=(JSONObject) jo.get("marks");
				Double assignment=(Double)marks.get("assignment");
				System.out.println(assignment);
				mark.setTest("assignment");
				mark.setScore(assignment);
				
				Double mid_sem=(Double)marks.get("mid_sem");
				System.out.println(mid_sem);
				mark.setTest("mid_sem");
				mark.setScore(mid_sem);
				
				
				Double endsem=(Double)marks.get("endsem");
				System.out.println(endsem);
				mark.setTest("endsem");
				mark.setScore(endsem);	
				
				System.out.println(mark);
				stud.setMarks(mark);
				
				
				
				int id = ((Number)jo.get("id")).intValue();
				System.out.println(id);
				stud.setId(id);
				
				String name=(String)jo.get("name");
				System.out.println(name);
				stud.setName(name);
				
				System.out.println(stud.getSubjects());
				//this.studentRepository.save(stud);
				students.add(stud);
			}
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(students);
			System.out.println(json);
			this.studentRepository.saveAll(students);
		}
		catch (FileNotFoundException e) {
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
