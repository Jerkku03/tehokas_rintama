from data import data
from mallit import paivittainen_tuotto, keskihajonta, keskiarvo, portfolio_keskihajonta, portfolio_odotettutuotto
import numpy 

#pearsonin korrelaatio
def korrelaatio(osake1, osake2):
    return numpy.corrcoef(osake1, osake2)[0, 1]


def main():
    print('Ohjeet: \n Katso löytyykö osakkeen tiedot painamalla 1 \n Laske tehokas rintama kahdella osakkeella painamalla 2')
    valinta = int(input('Numero:'))

    if valinta == 1:
        print('Hae yritystä tunnuksella esim apple hae AAPL')
        tunnus = input('syötä tunnus:')
        if len(data(tunnus)) == 0:
            print('tietoja ei saatavilla')
            return
        print('tiedot löytyy')
    
    if valinta == 2:
        nimi1 = input('osake1:')
        osake1 = data(nimi1)
        nimi2 = input('osake2:')
        osake2 = data(nimi2)
        paiv1 = paivittainen_tuotto(osake1)
        keskhaj1 = keskihajonta(paiv1)
        odotettutuotto1 = keskiarvo(paiv1)
        paiv2 = paivittainen_tuotto(osake2)
        keskhaj2 = keskihajonta(paiv2)
        odotettutuotto2 = keskiarvo(paiv2)
        korr = korrelaatio(paiv1, paiv2)
        print('Minimi varianssi:')
        print(f'{nimi1} {nimi2}  Portfolio keskihajonta    Portfolio odotettu tuotto')
        paino1 = 0 
        paino2 = 100
        for i in range(21):
            print(f'{paino1}%  {paino2}% {portfolio_keskihajonta(keskhaj1, keskhaj2, korr, paino1, paino2)}   {portfolio_odotettutuotto(odotettutuotto1, odotettutuotto2, paino1, paino2)}')
            paino1 += 5
            paino2 -= 5
    return

main()