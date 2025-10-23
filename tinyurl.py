"""
#the idea:
start at 'b'
tu becomes 'b',
next becomes c,d,e,f, ... until z
next becomes aa, ab, ac, ad, ae, az,
next comes aaa, aab, aac, aad, aae

"""

"""
import random

ukeys = open("ukeys", "r").read().splitlines()

tudict = {}
i = 0
while i < len(ukeys):
    host = ""
    for j in range(3):
        host += chr(random.randint(97, 97+25))
    url = f"www.{host}.de"
    tudict[ukeys[i]] = url
    i += 1

for i in range(len(ukeys)):
    print(tudict[ukeys[random.randint(0, len(tudict) - 1)]], end=" | ")
    if not i % 12 and i > 0:
        print()
"""

import random

ukeys = open("ukeys", "r").read().splitlines()

tudict = {}
i = 0
while i < 5:
    host = ""
    for j in range(3):
        host += chr(random.randint(97, 97+25))
    url = f"www.{host}.de"
    url = input("Give url:\n")
    url = f"www.{url}.de"
    tudict[ukeys[i]] = url
    print("Your tiny url: ", ukeys[i], "Your Url: ", tudict[ukeys[i]])
    i += 1

for i in range(5):
    print(ukeys[i], tudict[ukeys[i]])
    if not i % 12 and i > 0:
        print()