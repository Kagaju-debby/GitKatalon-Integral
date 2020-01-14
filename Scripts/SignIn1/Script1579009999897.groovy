import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/te/gecopvautaadb2cqvca001.onmicrosoft.com/b2c_1_standbymd-qa3-signin/oauth2/v2.0/authorize?client_id=03782a87-a607-4bc1-aefb-6aa9f8ca0e94&redirect_uri=https%3A%2F%2Fstandbymd-qa3.globalexcel.com%2Fsignin-oidc&response_type=code%20id_token&scope=openid%20profile%20offline_access%20https%3A%2F%2Ffabrikamb2c.onmicrosoft.com%2Fdemoapi%2Fdemo.read&response_mode=form_post&nonce=637146068246178514.Zjg4Mzg4MzgtMmZiMS00ZTVjLTk2NDMtMTM5YjNkMGU4MWRmMDI2YmZhMjItNjNmYi00NmE0LWFlZmItZjg3ODAzZWRhYWQz&state=CfDJ8DwxkJVK1UZGjf_Vi0EYHKBZS0NLIzPDOOBIl84avCliW6jTIww-gwhVd2PYvebGcb2mEys7HnoCcAPeqaRmRuxupL6IYK_uME2DrJVrAVKg4x87NBdwfuZevYVvtEeKTrOfrG7RzlPPW8Ef_1SXUufIZITNyKBiqp3TfpDPYwI9z6xVq4hXng8XNMt66I3J_evUZLbQXUobFJ8wKAy0RrBlo0CPMBOyhV8UisQtp4SAcxe0nmaBDyeWMm6VFmJwASP8RekTQ9rcOsi-9vnLlNbFYqUKTqOLoSV8cs18eFGTaI5xTiG-6lo8dF31dOUvmoajKT2avUYjSh_RgX6JbYk3iNrz3XJYm9m7VuKDDBfI&x-client-SKU=ID_NETSTANDARD1_4&x-client-ver=5.2.0.0')

WebUI.click(findTestObject('Object Repository/Signin folder1/Page_Choose your account/button_Client Sign-in'))

WebUI.setText(findTestObject('Object Repository/Signin folder1/Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 
    'qa3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Signin folder1/Page_Sign in to your account/input_Redirecting_passwd'), 
    'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Object Repository/Signin folder1/Page_Sign in to your account/button_Sign in'))

WebUI.closeBrowser()

