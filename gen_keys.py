# **************************************************************************** #
#                                                                              #
#                                                         :::      ::::::::    #
#    gen_keys.py                                        :+:      :+:    :+:    #
#                                                     +:+ +:+         +:+      #
#    By: gzenner <gzenner@student.42.fr>            +#+  +:+       +#+         #
#                                                 +#+#+#+#+#+   +#+            #
#    Created: 2025/07/30 09:25:22 by gzenner           #+#    #+#              #
#    Updated: 2025/07/30 09:25:22 by gzenner          ###   ########.fr        #
#                                                                              #
# **************************************************************************** #

import random

unique_keys = []
while len(unique_keys) < 1e4:
    key = ""
    for i in range(10):
        key += chr(random.randint(97, 97+25))
    if key not in unique_keys:
        unique_keys.append(key)

for key in unique_keys:
    open("ukeys", "a").write(f"{key}\n")