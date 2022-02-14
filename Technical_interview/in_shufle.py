def riffle(deck):
    new_deck = []
    deck_1 = deck[:len(deck)//2]
    deck_2 = deck[len(deck)//2::]
    for i in range(len(deck)//2):
        new_deck.append(deck_1[i])
        new_deck.append(deck_2[i])
    if len(deck) % 2 == 1:
        new_deck.append(deck[-1])
    return new_deck

deck = [i for i in range(1,53)]
print(deck)
print(riffle(deck))