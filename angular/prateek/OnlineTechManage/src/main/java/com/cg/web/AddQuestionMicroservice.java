package com.cg.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//import antlr.collections.List;

import com.cg.dto.AddQuestionSuccessMessage;
import com.cg.dto.QuestionDto;
import com.cg.entity.Questions;
import com.cg.exceptions.QuestionAddException;
import com.cg.service.QuestionService;
import com.cg.util.QuestionConstants;

@RestController
@CrossOrigin(value="http://localhost:4200")

public class AddQuestionMicroservice {
    Logger logger = LoggerFactory.getLogger(AddQuestionMicroservice.class);

	@Autowired
	private QuestionService questionService;
	
	@PostMapping(QuestionConstants.ADD_QUESTION_URL)
    public AddQuestionSuccessMessage AddQuestion(@RequestBody Questions questiondto) throws QuestionAddException{
		String msg= questionService.addQuestion1(questiondto);
		
		System.out.println("mgs is ......"+msg);
		logger.info("mgs is ......"+msg);
		return new AddQuestionSuccessMessage(msg);
	}
		
	/*
	@PostMapping(QuestionConstants.ADD_QUESTION_URL)
    public ResponseEntity<Questions>  AddQuestionSuccessMessage AddQuestion(@RequestBody Questions questiondto) throws QuestionAddException{
		String msg= questionService.addQuestion1(questiondto);
		
		return new AddQuestionSuccessMessage(msg);
	}*/

	
	@GetMapping("/getAllQuestion")
	public  List<Questions> getMyAllQuestion(){
		return questionService.getAllQuestion();
	}
	
	@PostMapping("/upload")
	public String mapReapExcelDatatoDB(@RequestParam("qfile") MultipartFile reapExcelDataFile) throws IOException {

	   List<QuestionDto>qlist = new ArrayList<QuestionDto>();
	XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	XSSFSheet worksheet = workbook.getSheetAt(0);
        QuestionDto ques = null;
	for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
		ques = new QuestionDto();
			XSSFRow row = worksheet.getRow(i);
	ques.setQuestionTitle(row.getCell(0).getStringCellValue());
	ques.setOptA(row.getCell(1).getStringCellValue());
	ques.setOptB(row.getCell(2).getStringCellValue());
	ques.setOptC(row.getCell(3).getStringCellValue());
	ques.setOptD(row.getCell(4).getStringCellValue());
	ques.setAnswer(row.getCell(5).getStringCellValue());
	ques.setExamid((int)row.getCell(6).getNumericCellValue());
	qlist.add(ques);
	
	    }
	questionService.addQuestion(qlist);
	return"File Uploaded Successfully";
	}
}
