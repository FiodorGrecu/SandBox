month = input('Enter the month: ')
from pprint import pprint

month_dict = {
    'January' : '31',
    'February' : {'28,29{Leap Year}'},
    'March' : '31',
    'April' : '30',
    'May' : '31',
    'June' : '30',
    'July' : '31',
    'August' : '31',
    'September' : '30',
    'October' : '31',
    'November' : '30',
    'December' : '31',
}

def data(month, month_dict):
    if month in month_dict.keys():
        return month_dict[month]
    else:
        return None

pprint(data(month,month_dict))