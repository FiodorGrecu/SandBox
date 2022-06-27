import smtplib

HOST = 'what_ever.com'
SUBJECT = 'My first email using Python'
TO = 'gre_dorelus@yahoo.com'
FROM = 'fiodorgrecu@gmail.com'
text = 'This could be something revolutionary'
BODY = '/r/n'.join((
    f'From: {FROM}',
    f'To: {TO}',
    f'Subject: {SUBJECT}',
    '',
     text)
)

server = smtplib.SMTP(HOST)
server.sendmail(FROM, [TO], BODY)
server.quit()