from selenium import webdriver
import time
from selenium.webdriver.chrome.service import Service
url = "https://www.google.com/"

driver = webdriver.Chrome(executable_path="/Users/Work/Desktop/B7-Selenium/chromedriver")


driver.get(url)
time.sleep(5)
driver.maximize_window()
time.sleep(5)
print(driver.title)
# driver.quit()