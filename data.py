

def data(nimi): 
    lista = []
    with open("sp500_stocks.csv") as tiedosto:
        for rivi in tiedosto:
            osat = rivi.split(',')
            if osat[1] == nimi and len(osat[2]) >= 1 and osat[0][:4] == '2024':
                l = [osat[0], osat[1], osat[2]]
                lista.append(l)
    return lista
            

