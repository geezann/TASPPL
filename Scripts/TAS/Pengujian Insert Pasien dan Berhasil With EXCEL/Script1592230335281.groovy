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

WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/login.php')

WebUI.setText(findTestObject('Page_Login/input_Login Akun_username'), username)

WebUI.setEncryptedText(findTestObject('Page_Login/input_Login Akun_password'), password)

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/dashboard.php')

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/a_Pasien'))

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/a_Tambah'))

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Nama_name'), name)

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Nomor Rekam Medis_medical_record_number'), no_rekam)

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Nomor Telepon_phone_number'), no_telp)

'Stak disini pak ditempat saya, whyyyyyyyyyyy :( . kagak mau record inputan tanggal lahirnya. saya akalin pakai data source juga kagak masuk tgl lahirnya :( sudah di spy, di capture, tetap aja gk mau pak'
WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Tanggal Lahir_dob (1)'), tgl_lahir)

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/textarea_Alamat_address'), alamat)

WebUI.click(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/label_Disabilitas'))

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/button_Simpan'))

