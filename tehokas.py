

def paivittainen_tuotto(osake):
    #laskee osakkeen päivittäise tuoton nykyarvo / aiempi pv -1
    tuotto = list(map(lambda x, y: (float(x[2]) / float(y[2])) - 1, osake[1:], osake))
    return tuotto

def keskihajonta(osake):
    keskiarvo = sum(osake) / len(osake)
    haj = sum(pow(x - keskiarvo, 2) for x in osake) / len(osake)
    return haj