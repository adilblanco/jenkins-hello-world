FROM python:3.8-slim AS builder

COPY Pipfile* /worker/
ENV PYTHONPATH="/worker"
WORKDIR /worker
RUN pip install --upgrade pip && \
    pip install pipenv==2022.8.31 && \
    pipenv requirements > requirements.txt


FROM python:3.8-slim AS main

WORKDIR /worker
ENV PYTHONPATH="/worker"
COPY --from=builder /worker/requirements.txt requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

COPY tests tests
COPY app.py app.py

ENTRYPOINT [ "python", "app.py" ]
