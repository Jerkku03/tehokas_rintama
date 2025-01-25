import math

def paivittainen_tuotto(osake):
    #laskee osakkeen päivittäise tuoton nykyarvo / aiempi pv -1
    tuotto = list(map(lambda x, y: (float(x[2]) / float(y[2])) - 1, osake[1:], osake))
    return tuotto

def keskiarvo(osake):
    return sum(osake) / len(osake)

def keskihajonta(osake):
    #päivittäinen odotettu tuotto
    keskiarvo = sum(osake) / len(osake)
    #keskihajonta
    haj = sum(pow(x - keskiarvo, 2) for x in osake) / len(osake)
    return math.sqrt(haj)

def portfolio_keskihajonta(keskhaj1, keskhaj2, korr, paino1, paino2):
    return math.sqrt(paino1**2*keskhaj1**2 + paino2**2*keskhaj2**2+2*paino1*paino2*korr*keskhaj1*keskhaj2)

def portfolio_odotettutuotto(odotettutuotto1, odotettutuotto2, paino1, paino2):
    return (paino1*odotettutuotto1+paino2*odotettutuotto2)


