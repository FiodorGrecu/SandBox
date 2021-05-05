figure_lsist = {'3':'Triangle' ,
                '4':'Quadrilateral' ,
                '5': 'Pentagon' ,
                '6':'Hexagon', 
                '7':'Heptagon',
                '8':'Octagon', 
                '9':'Nonagon'
}

data = []
figure = input('Give me a number of sides and I will tell you the geometrical figure: ')

if figure in figure_lsist:
    data.append(figure_lsist[figure])
    print(figure_lsist[figure])
else:
    print("Sorry this is not a geometrical value")