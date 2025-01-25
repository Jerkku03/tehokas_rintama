from data import data
from tehokas import paivittainen_tuotto, keskihajonta


def main():
    print('Hae yritystä tunnuksella esim apple hae AAPL')
    nimi = input('nimi:')
    yritykset = data(nimi)
    #print(yritykset)
    paiv = paivittainen_tuotto(yritykset)
    print(keskihajonta(paiv))
    return


main()