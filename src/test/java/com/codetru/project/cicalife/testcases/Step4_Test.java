package com.codetru.project.cicalife.testcases;

import org.testng.annotations.Test;

import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.ExcelHelpers;
import com.codetru.common.BaseTest;

public class Step4_Test extends BaseTest {
	
	 @Test
    public void TC_Beneficiary_Information() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
//        getStep_1Page().Product_Information();
//        getStep_2Page().Proposed_Insured_Information();
//        getStep_3Page().Policy_Owner_Information();
        getStep_4Page().Beneficiary_Information();
    }
}
