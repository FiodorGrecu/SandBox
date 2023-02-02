from selenium import webdriver
import time
from selenium.webdriver.chrome.service import Service

from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(ChromeDriverManager().install())

url = "https://www.google.com/"

driver.get(url)
time.sleep(2)
driver.maximize_window()
time.sleep(5)
print(driver.title)
driver.quit()